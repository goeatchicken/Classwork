package whackAMole;

import java.util.ArrayList;

import guiPratice.components.Action;
import guiPratice.components.TextLabel;
import guiPratice.components.Visible;
import guiPratice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface>moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		// TODO Auto-generated constructor stub
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}
	
	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
	//	player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, 50, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50, 120, 60,"");
		viewObjects.add(label);
	//	viewObjects.add(player);
		viewObjects.add(timeLabel);
		
	}
	/**
	 * this is a placeholder because early in the game design
	 * process, the player aren't designed yet, so
	 * we use this method later, once we learn how to create a player
	 * 
	 * @return
	 */

	private PlayerInterface getAPlayer() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this is a placeholder because early in the game design
	 * process, the (mole) aren't designed yet, so
	 * we use this method later, once we learn how to create a (mole)
	 * 
	 * @return
	 */
	
	private MoleInterface getAMole(){
		return null;
	}

	public void run() {
		// TODO Auto-generated method stub
		changeText("Set...");
		changeText("GO!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText("" + (int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMole();
		}
	}
	private void addNewMole() {
		// TODO Auto-generated method stub
		//probability of mole appearing depends on timeLeft
		double probability = .2+.1*(30.0 - timeLeft)/30;
		if(Math.random()<probability){
			final MoleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearanceTime((int)(500+Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//removeMole from viewObjects
					remove(mole);
					//remove mole from "database"
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		// TODO Auto-generated method stub
		//each mole has a "clock"
		//when the clock counts down to zero,
		//it disappears
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(1);
			m.setAppearanceTime(m.getAppearanceTime() - 100);
			if(m.getAppearanceTime() <= 0){
				//remove from viewObjects
				remove(m);
				//remove it from our mole database
				moles.remove(i);
				i--;//compensate for i++
			}
		}
	}

	public void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

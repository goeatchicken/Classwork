package guiPratice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPratice.Screen;
import guiPratice.components.Action;
import guiPratice.components.AnimatedComponent;
import guiPratice.components.Button;
import guiPratice.components.Graphic;
import guiPratice.components.MovingComponent;
import guiPratice.components.TextArea;
import guiPratice.components.TextLabel;
import guiPratice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,550,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.", null, null);
		button = new Button(40,200,80,40,"The Button",
				new Color(100,100,250),new Action() {
			
			public void act() {
				MouseFollower.game.
				setScreen(MouseFollower.moveScreen);
			}
		});
		picture = new Graphic(100,300,.5,"resources/sampleImages/theButton.jpg");
		
		
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add(picture);
		
		
//		MovingComponent mc = new MovingComponent(30,60,80,80);
//		mc.setVy(3);
//		mc.play();
//		viewObjects.add(mc);
		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		AnimatedComponent a = new AnimatedComponent(40, 50, 150, 150);
		try{
			ImageIcon icon = new ImageIcon("resources/sampleImages/zanpto_sprite_sheet.png");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX()+", "+m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseClicked(MouseEvent m) {
		if(button.isHovered(m.getX(), m.getY())){
			button.act();
		}
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}



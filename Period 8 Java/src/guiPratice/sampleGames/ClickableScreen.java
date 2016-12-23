package guiPratice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPratice.Screen;
import guiPratice.components.Clickable;
import guiPratice.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {

	private ArrayList<Clickable> clickables;
	
	public abstract void initAllObjects(ArrayList<Visible> visibles);
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public void mouseClicked(MouseEvent e){
		for (int i = 0; i < clickables.size(); i++){
			if(clickables.get(i).isHovered(e.getX(), e.getY())){
				clickables.get(i).act();
					break;
			}
		}
	}
	public void mouseEntered(MouseEvent e){
		
	}

	public void mouseExited(MouseEvent e){
		
	}
	public void mouseReleased(MouseEvent e){
		
	}
	public void mousePressed(MouseEvent e){
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for (int i = 0; i < viewObjects.size(); i++){
			if (viewObjects.get(i) instanceof Clickable)clickables.add((Clickable) viewObjects.get(i));
		}
	}
	

}
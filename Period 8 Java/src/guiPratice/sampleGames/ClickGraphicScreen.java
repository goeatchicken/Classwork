package guiPratice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPratice.Screen;
import guiPratice.components.Action;
import guiPratice.components.ClickableGraphic;
import guiPratice.components.Graphic;
import guiPratice.components.Visible;

public class ClickGraphicScreen extends Screen implements MouseListener{

	private ClickableGraphic pinkguy;
	
	public ClickGraphicScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		pinkguy = new ClickableGraphic(50, 50, .5, "resources/sampleImages/fffaaa.jpg");
		pinkguy.setAction(new Action(){
				public void act() {
					pinkguy.setX(pinkguy.getX() + 50);
					pinkguy.setY(pinkguy.getY() + 50);
				}
				
			});
		viewObjects.add(pinkguy);
	}

	public void mouseClicked(MouseEvent m) {
		if(pinkguy.isHovered(m.getX(), m.getY())){
			pinkguy.act();
		}
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
}

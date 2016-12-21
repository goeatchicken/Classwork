package guiPratice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickGraphicScreen implements MouseListener{

	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		if(theButton.isHovered(m.getX(), m.getY())){
			return image;
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

}

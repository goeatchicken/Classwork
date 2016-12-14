package guiPratice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPratice.Screen;
import guiPratice.components.Action;
import guiPratice.components.Button;
import guiPratice.components.TextArea;
import guiPratice.components.TextLabel;
import guiPratice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text", null, null);
		paragraph = new TextArea(40,85,760,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.", null, null);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		button = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void Act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button);
	}

	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent m) {
		// TODO Auto-generated method stub
		label.setText("Mouse at (" + m.getX() + ", " + m.getY());
		update();
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}

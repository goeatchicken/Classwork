package guiPratice.sampleGames;

import java.util.ArrayList;

import guiPratice.Screen;
import guiPratice.components.TextLabel;
import guiPratice.components.Visible;

public class CoordinateScreen extends Screen{
	
	private TextLabel label;

	public CoordinateScreen(int width, int height){
		super(width, height);
		
	}

	@Override
	public void initObject(ArrayList<Visible> viewObject) {
		// TODO Auto-generated method stub
		label = new TextLabel(40,45,760,-40,"");
		viewObject.add(label);
	}
}

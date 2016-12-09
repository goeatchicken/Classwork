package guiPratice.sampleGames;

import guiPratice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen coordScreen;
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}

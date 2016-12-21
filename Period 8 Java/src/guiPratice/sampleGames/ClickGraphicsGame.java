package guiPratice.sampleGames;

import guiPratice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication {
	
	public static ClickGraphicScreen clickScreen;
	public static ClickGraphicsGame game;

	public static void main(String[] args){
		ClickGraphicsGame ccg = new ClickGraphicsGame();
		Thread app = new Thread(ccg);
		app.start();
	}
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		clickScreen gcs = new ClickGraphicScreen(getWidth(), getHeight());
		
		setScreen(g);
	}

}

package guiPratice.sampleGames;

import guiPratice.GUIApplication;

public class MouseCoordinateGame extends GUIApplication {

	public static MouseCoordinateGame game;
	public static MovementScreen myScreen;
	
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		MovementScreen myScreen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new MouseCoordinateGame();
		Thread app = new Thread(game);
		app.start();
	}

}

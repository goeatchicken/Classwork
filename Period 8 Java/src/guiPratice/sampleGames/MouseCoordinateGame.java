package guiPratice.sampleGames;

import guiPratice.GUIApplication;
import guiPratice.components.Clickable;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseCoordinateGame extends GUIApplication implements Clickable{

	public static MouseCoordinateGame game;

	public MouseCoordinateGame(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		game = new MouseCoordinateGame(500, 500);
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		
	}
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	public void act() {
		// TODO Auto-generated method stub
		
	}
}

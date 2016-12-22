package whackAMole;

import guiPratice.GUIApplication;

public class WhackAMole extends GUIApplication {

	public WhackAMole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		whackAMoleScreen wams = new whackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

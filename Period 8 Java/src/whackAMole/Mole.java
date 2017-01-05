package whackAMole;

import guiPratice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface{
	
	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, "resources/sampleImages/ujhjhj.jpg");
		// TODO Auto-generated constructor stub
	}

	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	public void setAppearanceTime(int d) {
		// TODO Auto-generated method stub
		this.appearanceTime = d;
	}

}

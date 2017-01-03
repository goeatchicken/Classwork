package whackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import guiPratice.components.Component;

public class Player extends Component implements PlayerInterface{

	private int score;
	
	public Player(int x, int y) {
		super(x, y, 100, 100);
		// TODO Auto-generated constructor stub
	}
	public void increaseScore(int i){
		score+= i;
		update();
	}
	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(x, y, getWidth(), getHeight());
		g.
		g.
		g.
	}

}

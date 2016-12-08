package guiPratice;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GUIApplication extends JFrame {
	
	private Screen currentScreen;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIApplication();
	}
	
	public GUIApplication(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set true for removing border
		setUndecorated(false);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x, y, width, height);
		initScreen();
		setVisible(true);
	}

	protected void initScreen() {
		// TODO Auto-generated method stub
		Screen startScreen = new Screen(getWidth(), getHeight());
		currentScreen = startScreen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.GetImage(), 0, 0, null);
	}
}

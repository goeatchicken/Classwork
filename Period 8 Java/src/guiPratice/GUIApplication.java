package guiPratice;

import javax.swing.JFrame;

public class GUIApplication extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIApplication();
	}
	
	public GUIApplication(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x, y, width, height);
		setVisible(true);
	}
}

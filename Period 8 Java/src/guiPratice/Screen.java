package guiPratice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPratice.components.Visible;

public abstract class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;
	private ArrayList<Visible> viewObject;
	
	public Screen(int width, int height){
		viewObject = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initImage();
		initObject(viewObject);
	}
	public abstract void initObject(ArrayList<Visible> viewObject);
	
	public void initImage() {
		// TODO Auto-generated method stub
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	public void update() {
		// TODO Auto-generated method stub
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v : viewObject){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
//		g.setFont(new Font("Helvetica", Font.PLAIN, 20));
//		g.drawString("Hello!", 40, 80);
//		g.drawOval(0, 40, 120, 80);
//		g.drawRect(20, 120, 80, 110);
//		g.drawLine(100, 120, 110, 200);
//		
//		g.setColor(Color.green);
//		for(int i = 0; i< image.getWidth(); i+=2){
//			g.drawLine(i, 230, i, 238);
//		}
	}
	
	//method for creating and setting the starting screen
	public BufferedImage GetImage(){
		return image;
	}
}

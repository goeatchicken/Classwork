package guiPratice;

import java.awt.image.BufferedImage;

public class Screen {
	
	private int width;
	private int height;
	protected BufferedImage image;
	
	public Screen(int width, int height){
		this.width = width;
		this.height = height;
		initImage();
	}
	private void initImage() {
		// TODO Auto-generated method stub
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	public void update() {
		// TODO Auto-generated method stub
		
	}
	public BufferedImage GetImage(){
		return image;
	}
}

package guiPratice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class AnimatedComponent extends MovingComponent {
	
	private ArrayList<BufferedImage> frame; //the images that can be displayed
	private ArrayList<Integer> times; //the time each image is displayed
	private long displayTime; //the time when the last image switched
	private int currentFrame; //the frame that is currently being displayed
	private boolean repeat;

	public AnimatedComponent(int x, int y, int width, int height) {
		super(x, y, width, height);
		frame = new ArrayList<BufferedImage>();
		times = new ArrayList<Integer>();
		currentFrame = 0;
		repeat = true;
		
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	public void addFrame(BufferedImage img, Integer time){
		frame.add(img);
		times.add(time);
	}
	
	public void checkBehaviors(){
		// this would be where you add restrictions to he component's location
	}
	
	public void drawImage(Graphics2D g){
		long currentTime = System.currentTimeMillis();
		//check if it's time to change the frame AND check there are images to be drawn
		if(frame != null && frame.size() > 0 && frame.size() == times.size() && currentTime - displayTime > times.get(currentFrame)){
			//updating is occurring so update the display time
			displayTime = currentTime;
			//increase currentFrame
			currentFrame = (currentFrame+1)%frame.size();
			if(currentFrame == 0 && !repeat){
				setRunning(false);
				return;
			}
			//clear the previous image
			g = clear();
			BufferedImage newFrame = frame.get(currentFrame);
			//use the scaled image method to fit the image
			g.drawImage(newFrame, 0, 0, getWidth(), getHeight(), 0, 0, newFrame.getWidth(), newFrame.getHeight(), null);
			
		}
	}
}

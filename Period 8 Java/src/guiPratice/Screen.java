package guiPratice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiPratice.components.Visible;

public abstract class Screen {

	private int width;
	private int height;
	private ArrayList<Visible> viewObjects;

	protected BufferedImage image;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void 
	     initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width, 
				height, 
				BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		//		g.setFont(new Font("Helvetica",Font.PLAIN,20));
		//		g.drawString("Hello",	 40, 80);
		//		g.drawOval(0, 40, 120, 80);
		//		g.drawRect(20, 120, 80, 110);
		//		g.drawLine(100, 120, 110, 200);
		//		
		//		g.setColor(Color.green);
		//		for(int i = 0; i < image.getWidth(); i+=4){
		//			g.drawLine(i, 230, i, 238);
		//		}

	}

	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public MouseMotionListener getMouseMotionListener() {
		// TODO Auto-generated method stub
		return null;
	}
	public void remove(Visible v){
		/**
		 * ArrayList notes
		 * while this method is very simple, do not
		 * underestimate the trickiness of removing items in an ArrayList
		 * It causes indices to change
		 * Example:Suppose you have an ArrayList<integer> and you want to remove
		 * all values greater than 5
		 * THIS IS BAD:
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 *   if(list .get(i) > 5)list .remove(i);
		 * }
		 * 
		 * suppose you have (4,5,6,7)
		 * the first integer to be removed is 6, at index 2 since it gets removed, 7 moves form index 3 to 2.
		 * your list is now (4,5,6)
		 * after you increment i, i becomes 3.
		 * This is out of bounds so 7 never gets removed
		 * Instead, when an object is removed,decrease i to compensate for change in size.
		 * 
		 * CORRECT:
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 *   if(list.get(i) >5){
		 *   	list.remove(i){
		 *   	i--;
		 *   }
		 * }
		 **/
		viewObjects.remove(v);
		/**
		 * this removes the object that has the same identity
		 * as v, not an object that is equal to v
		 */
	}
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(0,v);
			//moves all objects with index >=n
			//forward by 1, increases size by 1
			//adds object to index n
		}
	}



}


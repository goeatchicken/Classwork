package arrays;

import java.util.Scanner;

public class Connect4 {
	
	public static Scanner in = new Scanner(System.in);
	static String [][] arr2D;
	static String [][] pic;
	static int posx;
	static int posy;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr2D = new String [8][15];
		pic = new String [8][15];
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "(" + row + "," + col + ")";
			}
		}
		printPic(pic);
		System.out.println("Make a move");
		
	}

	private static void printPic(String[][]pic) {
		// TODO Auto-generated method stub
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				if(col%2 == 1){
					pic[row][col] = "|";
				}
				else{
					pic[row][col] = " ";
				}
			}
		}
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
		System.out.println();
		}
		
	}
}

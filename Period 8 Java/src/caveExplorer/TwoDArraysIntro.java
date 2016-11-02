package caveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][]mines = new boolean[6][6];//filled with zero because primitive types
		plantMines(mines);
		String[][]field = createField(mines);
		printPic(field);
	}
	private static String[][] createField(boolean[][]mines){
		String[][]field = new String[mines.length][mines[0].length];
		for(int row = 0; row< field.length; row++){
			for(int col = 0; col<field[row].length; col++){
				if(mines[row][col]){
					field[row][col] = "x";
				}
				else{
					field[row][col]= countNearby(mines, row, col);
				}
			}
		}
	}
	private static void printPic(String[] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.println(col);
			}
			System.out.println();
		}
	}
	private static String countNearby(boolean[][] mines, int row, int col) {
		// TODO Auto-generated method stub
		for (int r = row - 1; r <= row; r++){
			for(int c = col-1; c <= col +1; col++){
				//check that this element exists
				if(row >= 0 && r < mines.length && c>= 0 && c < mines[0].length){
					
				}
			}
		}
		return null;
	}
	private static void plantMines(boolean[][]mines){
		int numberOfMines = 10;
		while(numberOfMines > 0){
			int row = (int) (Math.random() * mines.length);
			int col = (int) (Math.random() * mines[0].length);
			//this prevents the same mine being selected twice
//			while(mines[row][col]){
//				row = (int) (Math.random() * mines.length);
//				col = (int) (Math.random() * mines[0].length);
//			}
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}
	public static void picture(){
		String[][] pic = new String[10][8];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "";
			}
		}
		//grassy fields
		for(int row = 5; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "w";
			}
		}
		//sun
		pic[1][3] = "O";
		pic[2][3] = "/|\\   ";
		pic[1][2] = "-";
		pic[1][4] = "-   ";
		pic[3][1] = "      ";
		pic[4][1] = "      ";
		//top row and bottom row should be "_"
		
		for(int col = 0; col< pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col]= "_";
		}
		
		//first and lost column is "|"
		
		for(int row = 1; row<pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));
		//a 1D array prints a horizontal string
		
		String[][] arr2D = new String[5][4];
		System.out.println("The height is " + arr2D.length);
		System.out.println("The width is " + arr2D[0].length);
		for(int row = 0; row < arr2D.length; row++){
			//populate with coordinates
			for(int col=0; col<arr2D[row].length; col++){
				arr2D[row][col] = "(" + row + ", " + col + ")";
			}
		}
		//print 2D array
		//Every element in a 2D array IS itself an array
		for(String[] row : arr2D){
			System.out.println(Arrays.toString(row));
		}
	}
}

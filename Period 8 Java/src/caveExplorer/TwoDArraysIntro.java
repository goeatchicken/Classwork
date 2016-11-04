package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {

	public static Scanner in = new Scanner(System.in);
	static String[][]arr2D;
	static String[][]pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arr2D = new String [5][5];
//		pic = new String [5][5];
//		for(int row = 0; row < arr2D.length;row++){
//			//populate with coordinates
//			for(int col = 0; col<arr2D[row].length; col++){
//				arr2D[row][col] = "(" + row + "," + col + ")";
//			}
//		}
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
//		//startExploring();
		gridHW();
	}
	private static void startExploring(){
		// TODO Auto-generated method stub
		while(true){
			printPic(pic);
			System.out.println("You are in room " + arr2D[starti][startj] + ".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("What do you want to do");
			String intput = in.nextLine();
			
			int[] newCoordinates = interpretInput(intput);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
		System.out.println("You found the treasure, You win the game!");
	}
	private static int[] interpretInput(String input) {
		// TODO Auto-generated method stub
		//verify input is valid
		while(!isValid(input)){
			System.out.println("Sorry, in this game, you can only use the WASD controls");
			System.out.println("Tell me again what you would like to do");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w")){
			currenti--;
		}
		if(input.equals("s")){
			currenti++;
		}
		if(input.equals("a")){
			currentj--;
		}
		if(input.equals("d")){
			currentj++;
		}
		int[] newCoordinates = {starti, startj};
		if(currenti>=0 && currenti < arr2D.length & currentj >= 0 && currentj < arr2D[0].length){
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}
		else{
			System.out.println("Sorry, you have reached the edge of the known universe. You may go no futher in that direction");
		}
		return newCoordinates;
	}
	private static boolean isValid(String input) {
		// TODO Auto-generated method stub
		String[] validKeys = {"w", "a", "s", "d"};
		for(String key : validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}
	public static void gridHW(){
		String[][]field = new String[5][5];
		for(int col = 0; col< field[0].length; col++){
			field[0][col] = " __";
		}
		
		//first and lost column is "|"
		
		for(int row = 1; row<field.length; row++){
			field[row][0] = "|";
		}
		for(String[] row : field){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void minesweeper(){
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
		return field;
	}
	private static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	private static String countNearby(boolean[][] mines, int row, int col) {
		// TODO Auto-generated method stub
//		for (int r = row - 1; r <= row; r++){
//			for(int c = col-1; c <= col +1; col++){
//				//check that this element exists
//				if(row >= 0 && r < mines.length && c>= 0 && c < mines[0].length){
//					
//				}
//			}
//		}
//		return null;
		
		//this method ONLY considers actual elements
//		int count = 0;
//		for(int r = 0; r < mines[0].length;r++){
//			for(int c = 0; c < mines[r].length; c++){
//				if(Math.abs(r - row)+Math.abs(c=col)==1 && mines [r][c]){
//					count++;
//					return "" + count;
//				}
//			}
//		}
		
		//this method allows you to be most specific
		//for example you only want north and east
		int count = 0;
		count+=isValidAndTrue(mines, row -1, col);
		count+=isValidAndTrue(mines, row +1, col);
		count+=isValidAndTrue(mines, row, col-1);
		count+=isValidAndTrue(mines, row, col+1);
		return ""+count;
	}
	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		// TODO Auto-generated method stub
		if(i>= 0 && i<mines.length && j >= 0 && j <mines[0].length && mines[i][j]){
			return 1;
		}
		return 0;
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

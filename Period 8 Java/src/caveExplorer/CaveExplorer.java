package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoomPd8[][] caves;
	public static Scanner in;
	public static CaveRoomPd8 currentRoom;
	public static InventoryNockles inventory;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		caves = new CaveRoomPd8 [5][5];
		for(int row = 0; row < caves[row].length; row++){
			for(int col = 0; col < caves[col].length; col++){
				caves[row][col] = new CaveRoomPd8("This room has " + row + "," + "col");
			}
		}
		currentRoom = caves[1][2];
		currentRoom.enter();
		caves[1][2].setConnection(caves[1][1]);
		caves[1][2].setConnection(caves[2][2]);
		caves[1][2].setConnection(caves[1][3]);
		
	}
}


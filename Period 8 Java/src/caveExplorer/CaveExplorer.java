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
		caves[1][2].setConnection(CaveRoomPd8.WEST, caves[1][1], new Door());
		caves[1][2].setConnection(CaveRoomPd8.SOUTH, caves[2][2], new Door());
		caves[1][2].setConnection(CaveRoomPd8.EAST, caves[1][3], new Door());
		inventory = new InventoryNockles();
		startExploring();
	}

	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true){
			print(InventoryNockles.getDescription());
			print(currentRoom.getDescription());
			print("What dould you like to do?");
			String input = in.nextLine();
			act(input);
		}
	}
	private static void act(String input) {
		// TODO Auto-generated method stub
		currentRoom.interpretAction(input);
	}

	public static void print(String item){
		System.out.println(item);
	}
}


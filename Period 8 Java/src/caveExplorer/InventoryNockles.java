package caveExplorer;

public class InventoryNockles {

	private static boolean hasMap;
	private static String map;
	
	public InventoryNockles() {
		// TODO Auto-generated constructor stub
		hasMap = false;
		updateMap();
	}

	public static void setHasMap(boolean hasMap) {
		InventoryNockles.hasMap = hasMap;
	}

	public void updateMap() {
		// TODO Auto-generated method stub
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//convert these caves to a string representation
		//create map top side, except for the last column
		map = "";
		//horizontal line across top row with 4
		for(int i = 0; i< caves[0].length-1; i++){
			map+=" ___";
		}
		map += " ___\n";
		//each room
		for(CaveRoomPd8[] row : caves){
			//there are three rows of text
			for(int textRow = 0; textRow<3; textRow++){
				//the text is for each room
				for(CaveRoomPd8 cr: row){
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow== 1 && cr.getDoor(CaveRoomPd8.WEST)!=null){
						str = "  " + contents + "    ";
					}
					else if(textRow == 2){
						if(cr.getDoor(CaveRoomPd8.SOUTH) == null){
							str = "|___";
						}
						else{
							str = "|_ _";
						}
					}
					map += str;
				}//end of row of CaveRoomPd8
				map += "|\n";
			}
		}
	}

	public static String getDescription() {
		// TODO Auto-generated method stub
		if(hasMap){
			return map;
		}
		else{
			return "You have no inventory";
		}
	}

}

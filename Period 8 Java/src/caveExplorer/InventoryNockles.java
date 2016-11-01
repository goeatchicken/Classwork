package caveExplorer;

public class InventoryNockles {

	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		// TODO Auto-generated constructor stub
		hasMap = true;
		updateMap();
	}

	private void updateMap() {
		// TODO Auto-generated method stub
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//convert these caves to a string representation
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		if(hasMap){
			return map;
		}
		else{
			return "You have no inventory";
		}
	}

}

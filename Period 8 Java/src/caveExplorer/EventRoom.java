package caveExplorer;

public class EventRoom extends CaveRoomPd8 {

	private Playable event;
	private boolean eventHappened;
	public EventRoom(String description, Playable event) {
		super(description);
		// TODO Auto-generated constructor stub
		eventHappened = false;
		this.event= event;
	}
	
	public void enter(){
		//make all normal things happen
		super.enter();
		if(!eventHappened){
			eventHappened = true;
			event.play();
		}
	}

}

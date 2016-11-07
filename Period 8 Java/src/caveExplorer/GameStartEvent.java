package caveExplorer;

public class GameStartEvent implements Playable {

	private static final String[] SEQUENCE_1 = {"<A little yellow mouse wuth brown stripes and a ligtening shaped tail runs up to you", "Hi, I can see you are not from here", "Do you like puzzles?"};
	private static final String[] SEQUENCE_2 = {"You are going to have so much fin playing my 2D games." + "Take this map"};
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		// TODO Auto-generated method stub
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0){
			CaveExplorer.print("C'mon! You know yo like puzzles. Say yes!");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);
	}
	public static void readSequence(String[] seq){
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print("- - - press enter - - -");
			CaveExplorer.in.nextLine();
		}
	}
}

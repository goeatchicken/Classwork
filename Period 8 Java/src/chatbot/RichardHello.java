package chatbot;

public class RichardHello implements ChatBot{

	private String helloResponse;
	private boolean inHelloLoop;
	private int helloCount;
	
	private String[] calmResponse = {"We aleady said hello" 
		+ "Let's move the conversation along",
		"You said hello already, did you forget?"};
	
	private String[] angryResponse = {"Okay seriously, Stop saying hi.",
			"what is wrong with you and saying hello?"};
	
	//public because it's a constructor for another class
	public RichardHello(){
		helloCount = 0;
	}
	
	public void talk() {
		// TODO Auto-generated method stub
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse(); //helper method
			helloResponse = RichardMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				RichardMain.promptForever();
			}
		}
	}

	private void printResponse(){
		if(helloCount >4){
			int responseSelection = (int)(Math.random()*angryResponse.length);
			RichardMain.print(angryResponse[responseSelection]);
		}
		if(helloCount <4){
			int responseSelection = (int)(Math.random()*calmResponse.length);
			RichardMain.print(calmResponse[responseSelection]);
		}
	}
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(RichardMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(RichardMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(RichardMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}
}

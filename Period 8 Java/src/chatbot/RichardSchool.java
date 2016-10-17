package chatbot;

public class RichardSchool implements ChatBot{

	private boolean inSchoolLoop; 
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		//static call on promptInput method from RichardMain class
		while(inSchoolLoop){
			RichardMain.print("(Type 'quit' to go back)");
			schoolResponse = RichardMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				RichardMain.promptForever();
			}
			RichardMain.print("That's my favorate part about school!");
		}
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"}; 
		//could create a loop to iterate through array of triggers
		if(RichardMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(RichardMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}		
}

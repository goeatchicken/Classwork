package introduction;
	//http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf	

import java.util.Scanner;

public class StringPratice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstrateStringMethod();
		createFields();
		//promptInput();
		promptName();
		promptForever();
	}
	
	static Scanner input;
	static String user;
	
	public static void promptForever(){
		while(true){
			promptInput();
		}
	}
	public static void promptName(){
		print("Please Type Your Name");
		user = input.nextLine();
		print("Glad to meet you, " + user 
		+ ". For the rest of time, "
		+ "I will always call you," + user 
		+ ". You many call me Computer. " 
		+ "We should become friends!");
	}
	public static void promptInput(){
		print("Please Type Something");
		String userInput= input.nextLine();
		print("Congradulations! You Typed: " + userInput);
	}
	public static void createFields(){
		input = new Scanner(System.in);
		user = "";
	}
	public static void demonstrateStringMethod(){
		String text1 = new String ("Hello World!");
		String text2 = "Hello World!"; //Same thing as line ^^
		if (text1.equals(text2)){
		//== no work on comparing the objects
		System.out.println("These strings are equal!");
	}

		print(text1);
		print(text2);
		
		String word1 = "agasdtgasdf";
		String word2 = "asdfasdfase";
		//when the strings are the same, they are zero
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
	}
	public static void print(String s){
		String printString = "";
		int cutoff = 10;
		//checks for words to add
		//OIW s had a length > 0
		while(s.length() < 0){
			String nextWord = "";
			String cut = "";
			//checks to see if the next word will fit on the line
			//there must be still words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, this is the last word
				if (endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				
				nextWord = s.substring(0, endOfWord);
			}
			
			printString += cut+"/n";
		}
		System.out.println(printString);
	}
}

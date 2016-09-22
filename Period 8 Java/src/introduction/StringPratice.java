package introduction;
	//http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf	

import java.util.Scanner;

public class StringPratice {
	
	static Scanner input;
	static String user;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demonstrateStringMethod();
			createFields();
			//promptInput();
			promptName();
			promptForever();
		}
	public static void promptForever(){
		while(true){
			promptInput();
		}
	}
	public static void promptInput(){
		print("Please Type Something");
		String userInput= input.nextLine();
		print("Congradulations! You Typed: " + userInput);
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
		//when you are too lazy to type this
		String printString = s;
		int cutoff = 45;
		if (printString.length() > cutoff){
			for(int index=0; index*cutoff < s.length(); index++){
				printString += getCut(s, cutoff, index+1)+"\n";
			}
	//		int cut = 1;
		//	int cutIndex = cut + cutoff;
			//String currentCut = s.substring(0, cutIndex);
		}
		System.out.println(printString);
	}
	private static String getCut(String s, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		if(cutIndex < s.length())cutIndex = s.length);
		//start at last index and go backwards through the string
			int indexOfLastSpace = currentCut.length()-1;
			for(int i = currentCut.length()-1; i>=0; i--){
				String letter = currentCut.substring(i, i+1);
				if(letter.equals(" ")){
					indexOfLastSpace = i;
					break;
				}
			}
			//shorten the cut to end a space
			currentCut = currentCut.substring(0, indexOfLastSpace);
			printString = currentCut;
		}
	}

}

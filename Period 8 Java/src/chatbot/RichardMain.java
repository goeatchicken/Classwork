package chatbot;

import java.util.Scanner;

public class RichardMain {
	
	
	static Scanner input; 
	static String user;
	static String response;
	static boolean inMainLoop;
	//list all 
	static ChatBot school; 
	
	public static void main(String[] args) {
		//demonstrateStringMethods();
		createFields();
		//promptInput();
		promptName();
		promptForever();
	}
	
	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, " + user + ". How are you?");
			response = promptInput();
			
			//response to how you feel
			if(findKeyword(response, "good", 0) >= 0){
				print("That's wonderful! I don't care.");
			}
			else if(response.indexOf("school") >= 0){
				print("That's wonderful." + "Tell me about School.");
				//exit this while loop
				inMainLoop = false;
				// go to the school's talk method
				school.talk();
			}
			else{
				print("I don't understand");
			}
		}
	}
	
	public static int findKeyword(String searchString, String keyword, int startpsn) {
		
		//get rid of spaces
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		System.out.println("The phrase is " + searchString);
		System.out.println("The keyword is " + keyword);
		//find fist position of key word
		int psn = searchString.indexOf(keyword);
		System.out.println("The keyword was found at " +psn);
		//keep searching until context key word found
		while(psn >= 0){
			//Assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front, in it exists
			if(psn > 0){
				before = searchString.substring(psn-1, psn);
				System.out.println("The charactrer before is " + before);
			}
			//check if there us a character after the keyword
			if(psn + keyword.length() < searchString.length()){
				after = searchString.substring(psn + keyword.length(), psn + keyword.length() + 1);
				System.out.println("The charactrer after is " + after);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a")<0 && noNegations(searchString, psn)){
				System.out.println("Found " + keyword + " at " + psn);
				return psn;
			}
			else{
				psn = searchString.indexOf(keyword, psn+1);
				System.out.println("Did not find " + keyword + ". Checking position " + psn);
			}
		}
		
		return -1;
	}
	/**This is a helper method
	 *A helper method is a method designed for "helping"
	 *a larger method. Because of this, helper methods are generally private because
	 *they are only used by the methods they are helping
	 *Also, when you do your project I expect to see help methods because they also make 
	 *the code more readable
	 **/
	private static boolean noNegations(String searchString, int psn){
		//check to see if the word "no " is in front of psn
		/*check to see if there are 3 spaces in front
		*then check to see if "no " is there
		*/
		if(psn - 3 >= 0 && searchString.substring(psn-3,psn).equals("no ")){
			return false;
		}
		else if(psn - 4 >= 0 && searchString.substring(psn-4,psn).equals("not ")){
			return false;
		}
		else if(psn - 6 >= 0 && searchString.substring(psn-6,psn).equals("never ")){
			return false;
		}
		if(psn - 4 >= 0 && searchString.substring(psn-4,psn).equals("N'T")){
			return false;
		}
		return true;
	}
	public static void promptName() {
		print("Please enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user+". "  
				+ "For the rest of time, "
				+ "I will call you, "+user+"."
				+ "\nYou may call me Computer. "
				+ "\nWe should become friends.");
	}

	public static String promptInput(){
		String userInput= input.nextLine();
		return userInput;
	}
	
	
	public static void createFields() {
		input= new Scanner(System.in);
		user = "";
		school = new RichardSchool();
	}
	
	public static void demonstrateStringMethods(){
		String text1 = new String("Hello world!");
		String text2 = "Hello world!";
		
		if(text1.equals(text2)){
			print("These strings are equal.");
		}
		print(text1);
		print(text2);
		
		String word1 = "Abracadabra";
		String word2 = "Cadabra";
		//when the strings are the same, they equal zero
		//http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
	}
		
	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		//check for words to add
		//IOW s has a length > 0 
		while(s.length() > 0){
			String cut="";
			String nextWord = "";
			//check to see if the next word will fit on the line
			//there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				//add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				/*if there are no more spaces, this is the last word,so
				 add the whole thing */
				if(endOfWord == -1){
					endOfWord = s.length() - 1; //-1 for index
				}
				
				nextWord = s.substring(0, endOfWord+1);
			}
			printString += cut+"\n";
		}
		System.out.println(printString);
	}
}

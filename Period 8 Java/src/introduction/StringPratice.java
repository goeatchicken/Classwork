package introduction;

public class StringPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = new String ("Hello World!");
		String text2 = "Hello World!"; //Same thing as line 7
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
		System.out.println(s);
	}
}

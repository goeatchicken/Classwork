package arrays;

public class AdvancedArrayMethod {

	static int[] array;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array = new int [100];
		//int[] someArray = new int [50];
		//methodA(someArray);
		String[] array = {"a", "b", "c", "d", "e", "f"};
		shuffle(array);
	}
	private static void shuffle(String[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++){
			int random = (int) (Math.random()*6);
			swap(array, i, random);
		}
	}
	private static void swap(String[]arry, int i, int j){
		//make place holder and put the information in the placeholder
		String placeholder = arry[j];
		arry[j] = arry[i];
		arry[i] = placeholder;
	}
	private static void methodA(int[] someArray){
		int[] newArray = new int[someArray.length];
	}
	
	private static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}
		else{
			//print error message
			System.out.println("ERROR: tried to copy arrays of two different lengths");
		}
	}
}

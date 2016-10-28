package arrays;

public class ArraysPratice {
	
	public static void main(String[] args) {
		//	demostratePassByValue();
	//	int[] fiftyNumbers = new int[50];
	//	populate(fiftyNumbers);
	//	print(fiftyNumbers);
	//	randomize(fiftyNumbers, 50);
	//	print(fiftyNumbers);
	//	rollDice(fiftyNumbers, 3);
	//	print(fiftyNumbers);
	//	countResult(fiftyNumbers, 3);
		listPrime(100);
	}
	private static void listPrime(int limit) {
		// TODO Auto-generated method stub
		int lastToCheck = (int) (Math.sqrt(limit));
		boolean[]numbers =new boolean [limit + 1];
		for(int i = 0; i<limit+1; i++){
			numbers[i]=true;
		}
		//0 and 1 are not prime
		numbers[0] = false;
		numbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n" + prime + " is prime. Crossing off: ");
				for(int i = (int) (Math.pow(prime, 2)); i < limit +1; i+= prime){
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		System.out.println("\nThe primes are: ");
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index])System.out.print(index + ", ");
		}
	}
	public static void rollDice(int[]x, int numberOfDice){
//		for(int i = 0; i<x.length; i++){
//			int rand1 = (int) (1+(Math.random()*6));
//			int rand2 = (int) (1+(Math.random()*6));
//			x[i] = rand1 + rand2;
//		}
		for(int i = 0; i< x.length; i++){
			int dice = 0;
			for(int j = 0; j< numberOfDice; j++){
				dice = dice + (int) (1 + 6*Math.random());
			}
			x[i]=dice;
		}
	}
	public static void countResult(int[]x, int numberOfDice){
		int[] counter = new int[numberOfDice*6];
		for(int n : x){
			counter[n-1] = counter[n-1] + 1;
		}
		for(int i = numberOfDice-1; i < counter.length; i++){
			System.out.println((i+1) + " was rolled " + 100*counter[i]/x.length + " percent of the time");
		}
	}
	private static void populate(int[] s){
		for(int i = 0; i < s.length; i++){
			s[i] = i + 1;
		}
	}
	public static void randomize(int [] num, int max){
		for(int i = 0; i<num.length; i++){
			int rand = (int) (1+(Math.random()*max));
			num[i] = rand;
		}
	}
	public static void print(int [] x){
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static void initializingArraysExample(){
		
		//Arrays: fixed length, indicates start at zero, indexed(ordered), common data type
		// arrays if any type must be Object[]
		//if you want to put different primitive types into an array, you must use their wrapper 
		//class(classes that represent the primitive types)
		
		//primitive arrays are "already" in the system and connect mix types
		//object arrays (unless initialized) starts at null and different types of objects in an array of common superclass
		
		boolean [] boos1 = new boolean [3];
		//this can ONLY be done at the declaration because it sets size AND content
		boolean [] boos2 = {false, false, false};
		//this does not work:
		//boos3 = {false, true, false};
		//this works:
		boolean [] boos3;
		boos3 = new boolean[3];
		
		//two ways of iterating through an Array
		/**
		 * STANDARD FOR LOOP
		 * 			- the index is important to keep track if
		 * 			- you need to customize the order
		 */
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		/**
		 * For EACH LOOP
		 * 			- the index is not important
		 * 			- you don't need to customize
		 * 			- automatically assigns a "handle"
		 */
		for(boolean b : boos1){
			System.out.println(b);
		}
		//OBJECT ARRAYS
		String[] someString1 = new String[3];
//		someString1[0]="a";
//		someString1[1]="b";
//		someString1[2]="c";
		//bit is repetitive
		String[] someString2 = {"a", "b", "c"};
		
	//	does not work cuz it does nothing
//		for(String s : someString1){
//		s = "a new String";
//		}
		
	//	this one works
		for(int i = 0; i < someString1.length; i++){
			someString1[i] = "a new String";
		}
		for(String s : someString1){
			System.out.println(s);
		}
	}
		
	private static void demostratePassByValue(){
				//how do you time a process?
		long currentTime = System.currentTimeMillis();
		
		String[] someString = new String[1000];
		standardPopulate(someString);
		String s = someString[999];
		makeSpecial(s);
		someString[999] = getASpecialString();
		print(someString);
	//	initializingArraysExample();
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + " ms.");
	}
	private static String getASpecialString(){
		return "THIS STRING IS SPECIAL!";
	}
	private static void makeSpecial(String s) {
		// TODO Auto-generated method stub
		s = "THIS STRING IS SPECIAL!";
	}

	private static void print(String[] s) {
		// TODO Auto-generated method stub
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}

	private static void standardPopulate(String[] s){
		for(int i = 0; i < s.length; i++){
			s[i] = "String #" +  (i + 1);
		}
	}
}

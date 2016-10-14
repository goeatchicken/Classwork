package arrays;

public class ArraysPratice {

	static boolean [] boos3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays: fixed length, indicates start at zero, indexed(ordered), common data type
		// arrays if any type must be Object[]
		//if you want to put different primitive types into an array, you must use their wrapper 
		//class(classes that represent the primitive types)
		
		boolean [] boos1 = new boolean [3];
		//this can ONLY be done at the declaration because it sets size AND content
		boolean [] boos2 = {false, false, false};
		//this does not work:
		//boos3 = {false, true, false};
		//this works:
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

}

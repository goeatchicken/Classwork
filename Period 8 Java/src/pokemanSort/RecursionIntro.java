package pokemanSort;

public class RecursionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using 'For-Loop'");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World" + " x" + i);
		}
		System.out.println("Without using 'For-Loop'");
		forLoop(5, new Action() {
			
			private int value = 0;
			
			public void act() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!"+ " x" + value);
				value++;
			}
		});
	}
	public static int factorial(int x){
		//for loop method
		int factorial = 1;
		for(int i = x; i > 0; i--){
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
		//recursive method
//		if(x >1){
//			return x * factorial(x-1);
//		}
//		return 1;
	}
	private static void forLoop(int i, Action action) {
		// TODO Auto-generated method stub
		if(i <= 0){
			//base case
			return;
		}else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1,action);
		}
	}
	
}

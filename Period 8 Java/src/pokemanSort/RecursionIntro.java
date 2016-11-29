package pokemanSort;

public class RecursionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using 'For-Loop'");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World");
		}
		System.out.println("Without using 'For-Loop'");
		forLoop(5, new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!");
			}
		});
	}

}

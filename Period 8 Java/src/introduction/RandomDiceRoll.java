package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] results = new int[6];
		for(int index = 0; index < 10; index++){
			int result = rollUnfairDice();
			//change this to rollFairDice to use fair dice
			System.out.println("Roll #" + (index+1) + ": " + result);
			results[result-1]++;
		}
		for(int i = 0; 1 < 6; i++){
			System.out.println((i+1)+"appeared" + results[i]+" times");
		}
		/*for(int index = 0; index < 10; index++){
			//declare variable, logic test, increment
			System.out.println("roll number " + (index + 1) + ": " + rollFairDice());
		}
		for(int index = 0; index < 10; index++){
			System.out.println("*roll number " + (index + 1) + ": " + rollUnfairDice());
		}*/
	}
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDice(){
		double rand = Math.random();
		//returns a double between 0 to 1 exclusive
		int roll = (int) (6*rand);
		//numbers including 1 to 6 inclusive
		roll++;
		return roll;
	}
	public static int rollUnfairDice(){
		double rand = Math.random();
		int roll = (int) (6*rand);
		roll++;
		if(roll == 5 || roll < 2){
			roll = 6;
		}
		return roll;
	}
	
}

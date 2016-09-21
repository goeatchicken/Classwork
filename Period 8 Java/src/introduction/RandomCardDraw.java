package introduction;

public class RandomCardDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "Ace"};
		String[] suits = {"Spades", "Diamonds", "Hearts", "Clover"};
		int value = (int) (Math.random()*values.length);
		int suit = (int) (Math.random()*suits.length);
		System.out.println(values[value]+" of "+ suits[suit]);
	}

}

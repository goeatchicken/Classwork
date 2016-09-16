package introduction;

public class Freshmen extends Student {
	
	String food;

	public Freshmen(String name, String food) {
		super(name);
		// TODO Auto-generated constructor stub
		this.food = food;
	}
	public void talk(){
		super.talk();
		System.out.println("...and I am a Freshmen and I like " + food + "!");
	}
}

package introduction;

public class Senior extends Student {
	
	String favoriteColor;

	public Senior(String name, String color) {
		super(name);
		// TODO Auto-generated constructor stub
		this.favoriteColor = color;
		
	}		
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior and I like " + favoriteColor + "!");
	}
	
}

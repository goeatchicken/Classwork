package introduction;

public class OOPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student jillian = new Senior("Jillian", "purple");
			Student joseph = new Freshmen("Joseph", "potatoes");
			Student jordan = new Sophomore("Jordan");
			//Student jordan = new Senior("Jordan"); <-also works because Senior "is-a" Student
			//Senior jordan = new Student("Jordan"); <-does not work because Student is not ("is-a") Senior
			
			jillian.talk();			
			joseph.talk();	
			jordan.talk();
			
	}
}

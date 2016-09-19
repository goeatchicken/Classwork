package introduction;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.0/2);
		System.out.println((double) 5/2);
		System.out.println(5/2);
		//it is not a double so it ignores everything after the point
		System.out.println(3+5.0/2+5*2);
		//follows PEMDAS
		System.out.println(3.0+5/2+5*2);
		//not double at "5/2" but double "3.0, thus making it 15.0\
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		//answer is 8.0/12, but because it is .666-- and (int) it removes all after point
		//making it 0
		if(42 == 42.0) System.out.println("42 equals 42.0");
	}

}

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
		//answer is 8/12, but because it is .666-- and (int) it removes all after point
		//making it 0
		if(42 == 42.0) System.out.println("42 equals 42.0");
		
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));		

		String ten = "10";
		String two = "2";
		if(ten.compareTo(two)>0) System.out.println("10 is greater than two");
		else System.out.print("10 is not greater than two");
		//the "10" becomes a "1 0" which is letters, not a single number 
		//thus "10" comes first instead of "2" because '2 > 1'
		
		
	}

}

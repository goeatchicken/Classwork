package introduction;

public class Student {
	//fields
	private String name;
	//constructor (initalize fields)
	public Student(String name){
		//"this" refers to 'private String name;'
		this.name = name;
	}
	
	public void talk(){
		//when there is no local 'name' the 'name' will go back to field
		//if there is a local 'name' then the line will refer to that local 'name'
		System.out.println("Hello, my name is " + name);
	}
}

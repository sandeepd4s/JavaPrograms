package inheritence;

public class B extends A{
	
	public String name="Sandeep Reddy";
	public int age = 31;
	public int sal =32;
	
	public String getName(){
		System.out.println("B");
		return name;
	}
	
	public int getAge(){
		System.out.println("B");
		return age;
	}
	
	public int getSal(){
		System.out.println("B");
		return sal;
	}

}

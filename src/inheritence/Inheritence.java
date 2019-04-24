package inheritence;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();
		System.out.println("age : "+b1.age);
		System.out.println("Name : "+b1.name);
		System.out.println("Sal : "+b1.sal);
		System.out.println("********************");
		System.out.println(b1.getAge());
		System.out.println(b1.getName());
		System.out.println(b1.getSal());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		A b = new B();
		System.out.println("age : "+b.age);
		System.out.println("Name : "+b.name);
		System.out.println("Sal : "+b.sal);
		System.out.println(b.getAge());
		System.out.println(b.getName());
		System.out.println(b.getSal());
	}

}

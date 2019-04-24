package sample;
public class NumberSwap {

	static int a=-3;
	static int b=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a +" and "+b);

	}

}

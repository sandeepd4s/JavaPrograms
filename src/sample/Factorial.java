package sample;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int fact = 1;
		
		for(int c=1;c<=n;c++){
			fact = fact*c;
		}
		
		System.out.println("Facotrial value is : "+fact);

	}

}

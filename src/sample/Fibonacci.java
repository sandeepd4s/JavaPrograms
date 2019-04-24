package sample;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1=0;
		int i2=1;
		int n =10;
		int count;
		System.out.print(i1+" "+i2+" ");
		for(int i=0;i<n;i++){
			count=i1+i2;
			i1=i2;
			i2=count;
			System.out.print(count+" ");
		}

	}

}

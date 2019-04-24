package sample.starpatterns;

public class Star2 {
	
	public static void main(String[] a){
		int n=5;
		for(int i=n;i>=0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

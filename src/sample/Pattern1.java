package sample;

public class Pattern1 {
	
	static int n=5;

	public static void main(String[] a) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

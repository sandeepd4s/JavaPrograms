package sample;

public class Pattern {
	static int n=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

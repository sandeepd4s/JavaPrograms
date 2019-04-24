package sample.starpatterns;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int b = 65;
		char c = (char) b;
		
//		for(int i=0;i<n;i++){
//			b = 65;
//			c = (char) b;
//			for(int j=i;j<n;j++){
//				System.out.print(c+" ");
//				b++;
//				c=(char) b;
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=n;i++){
			b=65;
			c=(char)b;
			for(int j=1;j<=i;j++){
				System.out.print(c+" ");
				b++;
				c=(char) b;
			}
			System.out.println();
		}
		
		
		

	}

}

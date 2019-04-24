package sample.starpatterns;

public class Star4 {
	
	public static void main(String[] a){
		int n=5;
		int i,j,k=2*n-2;
		
		for(i=0;i<n;i++){
			for(j=0;j<k;j++){
				System.out.print(" ");
			}
			k=k-2;
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		n=n-1;
		k=2*n-2;
		System.out.print("  ");
		for(i=n;i>0;i--){
			for(j=n;j>i;j--){
				System.out.print("  ");
			}
			//k=k-2;
			for(int l=i;l>0;l--){
				System.out.print("* ");
			}
			System.out.println();
			System.out.print("  ");
		}
	}

}

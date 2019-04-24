package sample.starpatterns;

public class Star3 {
	
	public static void main(String[] a){
		int n=5;
		int i,j,k=2*n-2;
		//no .o f lines
		for(i=0;i<n;i++){
			//to handle spaces
			for(j=0;j<k;j++){
				System.out.print(" ");
			}
			k=k-2;
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

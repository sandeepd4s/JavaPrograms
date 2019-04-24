package sample.number.format;

public class NumberFormat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int j =0;
		for(int i=n;i>0;i--){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			while(j<=n){
				System.out.print(j);
				j++;
			}
			System.out.println();
		}

	}

}

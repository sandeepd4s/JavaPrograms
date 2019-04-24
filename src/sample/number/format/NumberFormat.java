package sample.number.format;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		for(int a =1;a<=n;a++){
			for(i=a;i<n;i++){
				System.out.print(" ");
			}
			i=1;
			for(int j=a;j>=i;j--){
				while(j>=1){
					System.out.print(j);
					j--;
					i++;
				}
				j=j+2;
				while(j<=a){
					System.out.print(j++);
				}
			}
			System.out.println();
		}
		for(int a=n-1;a>=1;a--){
			for(i=a;i<n;i++){
				System.out.print(" ");
			}
			i=1;
			for(int j=a;j>=i;j--){
				while(j>=1){
					System.out.print(j);
					j--;
					i++;
				}
				j=j+2;
				while(j<=a){
					System.out.print(j++);
				}
			}
		System.out.println();
		}
	}
}

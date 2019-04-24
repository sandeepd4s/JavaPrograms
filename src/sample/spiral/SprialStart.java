package sample.spiral;
public class SprialStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
		 * k -> starting row
		 * l - > ending row
		 * m -> starting column
		 * n -> ending column
		 * i -> iterator
		 */
		int[][] a = {{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}};
		int l=3;
		int n=3;
		int k=0;
		int m=0;
		int i=0;
		while(k<l && m<n){
			for(i=m; i<=n; i++){
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(i=k;i<=l;i++){
				System.out.print(a[i][l]+" ");
			}
			--n;
			for(i=n;i>=m;i--){
				System.out.print(a[l][i]+" ");
			}
			--l;
			for(i=l;i>=k;i--){
				System.out.print(a[i][m]+" ");
			}
			++m;
		}
	}

}

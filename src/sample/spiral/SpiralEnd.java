package sample.spiral;
public class SpiralEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sr=0;
		int er=4;
		int sc=0;
		int ec=4;
		int i=0;
		
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}
		};
		
		while(sr<=er && sc<=ec){
			for(i=sc; i<=ec;i++){
				System.out.print(a[er][i]+" ");
			}
			er--;
			for(i=er;i>=sr;i--){
				System.out.print(a[i][ec]+" ");
			}
			ec--;
			for(i=ec;i>=sc;i--){
				System.out.print(a[sr][i]+" ");
			}
			sr++;
			for(i=sr;i<=er;i++){
				System.out.print(a[i][sc]+" ");
			}
			sc++;
		}
	}
}

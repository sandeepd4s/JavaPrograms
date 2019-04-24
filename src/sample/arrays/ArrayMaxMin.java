package sample.arrays;

public class ArrayMaxMin {

static int[] a = {10,4,8,-9,-29, -23,-7,5, -17,11, 4, 341,6,-10,321,4,-22,2,689,8,-9};
	
	static int max =a[0];
	static int sMax = a[0];
//	static int tSMax = max;
	static int min =a[0];
	static int sMin = a[0];
//	static int sMin = min;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(sMax<a[j] && max>a[j]){
					sMax=a[j];
				}
				if(a[i]<a[j] && max<a[j]){
					sMax=max;
					max=a[j];
				}
				if(sMin>a[i] && min<a[i]){
					sMin=a[i];
				}
				
				if(a[i]<a[j] && min>a[i]){
					sMin=min;
					min=a[i];
				}
			}
		}
		System.out.println("Maximum " +max);
		System.out.println("Minimum " +min);
		
		System.out.println("Second Maximum " +sMax);
		System.out.println("Second Minimum " +sMin);
	}

}

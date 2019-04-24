package sample;

public class Arrays2ndMax2ndLeast {
	
	static int[] a = {1,4,8,-9,-7,5,7,4,34,6,9,4,3,2,2,6,8,-19};
	
//	a={1,4,8,-9,-7,5,7,4,34,6,9,4,3,2,2,6,8,-9};
	static int max =a[0];
	static int tMax = max;
	static int tSMax = max;
	static int min =a[0];
	static int sMax = a[0];
	static int sMin = a[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					//max=a[j];
					if(a[j]>sMax){
						if(a[j]<max){
							sMax=max;
							max=a[j];
						}
					}
					if(max>tMax){
						tSMax=tMax;
						tMax=max;
					}
//					if((tSMax<max)&&(tMax>tSMax)){
//						tSMax=max;
//					}
				}else if(a[i]>a[j]){
					//min=a[j];
					if(a[j]<min){
						sMin=min;
						min=a[i];
					}
//					if(sMin>min){
//						sMin=min;
//					}
				}
			}
		}
		
		System.out.println("Min :"+min);
		System.out.println("Second Min :"+sMin);
		
		System.out.println("Max :"+max);
		System.out.println("Second Max :"+tSMax);

	}

}

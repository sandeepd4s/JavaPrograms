package sample.arrays;

public class Shares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {4,3,8,12,19,4,8,45,23,43,89,56,87,4,5,2,8,98,87,78,76,65,34,344,67,98,67,54,45,89,88,78,65,32,62,82,92,82,90};
		int maxProfit=a[0]-a[1];
		int maxLoss=a[0]-a[1];
		int tempProf=0;
		int tempLoss=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					if(maxProfit<a[j]-a[i]){
						tempProf = maxProfit;
						maxProfit = a[j]-a[i];
					}
				}else if(a[i]>a[j]){
					if(maxLoss<a[i]-a[j]){
						tempLoss=maxLoss;
						maxLoss=a[i]-a[j];
					}
				}
			}
		}
		
		System.out.println("1st Max Profit:"+maxProfit);
		System.out.println("1st Max Loss:"+maxLoss);
		System.out.println("2nd Max Profit:"+tempProf);
		System.out.println("2nd Max Loss :"+tempLoss);
		
		
	}

}

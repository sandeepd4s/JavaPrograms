package sample.arrays;

import java.util.Arrays;

public class RemoveDupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,3,5,8,1,3,8,9,10,5,8,9,1,1,3};
		int n = a.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++)
			if(a[i]==a[j]){
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
		
		for(int l=0;l<n;l++){
			System.out.println(a[l]);
		}

	}

}


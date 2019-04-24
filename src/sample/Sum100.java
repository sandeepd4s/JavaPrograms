package sample;

import java.util.ArrayList;
import java.util.Random;

public class Sum100 {

	static int sum=0;
	static int n=100;
	static int ni =5;
	static int count =0;
	static int num=0;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i=0;i<n;i++) {
			num=random.nextInt(100);
			if((!list.contains(num)) && (sum+num)<=100 && list.size()<5) {
				//System.out.println("Generated num : "+num);
				sum=sum+num;
				count++;
				list.add(num);
			}else {
				i--;
			}
			//System.out.println("Sum : "+sum);
			
			if(sum!=100 && list.size()==5) {
				count--;
				sum=sum-num;
				i--;
				list.remove(list.size()-1);
			}
//			if(sum==100 && list.size()!=5) {
//				count--;
//				sum=sum-num;
//				i--;
//				list.remove(list.size()-1);
//			}
			if(sum==100 && count==ni) {
				System.out.println("The numbers are :");
				for(Integer in : list) {
					System.out.println(in);
				}
				break;
			}
		}
		
	}

}

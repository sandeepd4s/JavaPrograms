package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomSum {

	static int a;
	static HashSet set = new HashSet();
	static ArrayList l = new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int dSum = 100;
		int tSum=0;
		int count = 4;
		Random random = new Random();
		boolean flag=true;
		for(int i=0;i<count;i++){
			a = random.nextInt(dSum);
			System.out.println("Generated number :"+ a);
			if((!l.contains(a)) && l.size()<4 && (sum+a)<=100){
				l.add(a);
				sum=sum+a;
			}else{
				i--;
			}
			System.out.println("Sum value is :"+sum);
			if(l.size()==4 && sum!=100){
				System.out.println("Before remove"+sum);
				l.remove(l.size()-1);
				sum=sum-a;
				System.out.println("After remove"+sum);
				i--;
			}
			if(l.size()==4 && sum==dSum){
				System.out.println("The generated random number are");
				System.out.println(l.get(0));
				System.out.println(l.get(1));
				System.out.println(l.get(2));
				System.out.println(l.get(3));
				break;
			}
		}
		System.out.println("*******************");
		System.out.println("Final Size :"+l.size());
		System.out.println("Sum :"+sum);
		for(int j=0;j<l.size();j++){
			System.out.println("i th/st number :"+l.get(j));
		}
	}

}

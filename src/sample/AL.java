package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>  a = new ArrayList<Integer> ();
		a.add(3);
		a.add(4);
		a.add(5);
		
		ArrayList<Integer>  b = new ArrayList<Integer> ();
		b.add(7);
		b.add(8);
		b.add(9);
		
		Iterator<Integer> i1 = a.iterator();
		Iterator i2 = b.iterator();
		
		
		for(Integer i : a){
			for(Integer j : b){
				if(i<j){
					System.out.println(i);
				}
			}
		}
		
//		for(;i1.hasNext();){
//			for(;i2.hasNext();){
//				if((Integer)i1.next()<(Integer)i2.next()){
//					System.out.println(i1.next());
//				}
//			}
//		}

	}

}

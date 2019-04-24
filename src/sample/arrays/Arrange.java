package sample.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Arrange {
	
	static int[] a = {5, 2,5,2,8,6,8,8};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int maxValue=0;
		int maxKey=0;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			if(map.containsKey(a[i])){
				map.put(a[i],map.get(a[i])+1);
			}else if(!map.containsKey(a[i])){
				map.put(a[i], 1);
			}
		}
		
		for(int j=0;j<map.size()-1;j++){
			Collection<Integer> values = map.values();
			Object[] b = values.toArray();
			int v = Integer.valueOf((int)b[0]);
			if(v>maxValue){
				maxValue=v;
			}
		}
		System.out.println("Max Occurences"+maxValue);
		Set keys = map.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			int key = (int) ite.next();
			if(map.get(key) == maxValue){
				for(int k=0;k<maxValue;k++){
					result.add(key);
				}
			}
		}
		for(int k=0;k<result.size();k++)
			System.out.println(result.get(k));	*/
		
		ArrayList<Integer> keys = new ArrayList<Integer>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		
		int ind=0;
		
		for(int i=0;i<a.length;i++){
			if(!keys.contains(a[i])){
				keys.add(a[i]);
				values.add(1);
			}else{
				ind = keys.indexOf(a[i]);
				values.set(ind, values.get(ind)+1);
			}
		}
		
		for(int j=0;j<keys.size();j++){
			System.out.print(keys.get(j)+" ");
		}
		System.out.println();
		for(int j=0;j<values.size();j++){
			System.out.print(values.get(j)+" ");
		}
		System.out.println();
		
		int maxVal =0; int maxValInd = 0;
		for(int k=0;k<values.size();k++){
			for(int l=0;l<values.size();l++){
				if(!indexes.contains(l)){
					if(maxVal<values.get(l)){
						maxVal=values.get(l);
						maxValInd=l;
					}
				}
			}
			indexes.add(maxValInd);
			for(int j=0;j<values.get(maxValInd);j++){
				System.out.print(keys.get(maxValInd)+" ");
			}
			maxVal=0;
			maxValInd=0;
			
		}
		
		

	}

}

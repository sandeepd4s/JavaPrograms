package sample.Strings;

import java.util.HashMap;

public class LongestSubStringDoesNotContainsDuplicates {

	static String s="ImSbcfghjklnoqrtandepHKnowMuchBetterAboutYouNow";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = s.length();
		String longestString = null;
		String subS;
		int tempSubSL=0;
		boolean flag;
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				subS = s.substring(i, j);
				HashMap sa = new HashMap();
				for(int k=0;k<subS.length();k++){
//					System.out.println(subS);
					char a=subS.charAt(k);
					if(sa.containsKey(a)){
						sa.put(a, (Integer)sa.get(a)+1);
						break;
					}else {
						sa.put(a, 1);
					}
				}
				if(subS.length()==sa.size()){
					int subSL =subS.length();
					if(subSL>0){
						if(tempSubSL<subSL){
							tempSubSL=subSL;
							longestString = subS;
						}
					}
				}
			}
		}
		
		System.out.println("Longest String is: "+ longestString);

	}

}

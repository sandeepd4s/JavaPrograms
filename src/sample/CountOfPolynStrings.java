package sample;

public class CountOfPolynStrings {
	
	public static boolean isPolyndrom(String s){
		String rev = "";
		boolean flag = false;
		for(int i=s.length()-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}
		if(rev.length()>1){
			if(rev.equals(s)){
				System.out.println(rev);
				flag = true;
			}
		}
		if(!rev.equals(s)){
			flag= false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str = "IKnowmuchbetteraboutyouIMeannitin";
		for(int i=1;i<=str.length();i++){
			String p = str.substring(0, i);
			for(int j=i+1;j<=str.length();j++){
				String pc = str.substring(i,j);
				if(isPolyndrom(pc)){
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}

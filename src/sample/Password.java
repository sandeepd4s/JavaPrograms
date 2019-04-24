package sample;
public class Password {
	
	public static boolean isValidPassword(String s){
		boolean flag = false;
		boolean lFlag = false;
		boolean sFlag = false;
		int count=0;
		Character c[] = {'!','@','#','$','_'};
		
		if(s.length()>8 && s.length()<16){
			lFlag=true;
			count++;
		}
		if(!s.contains("123")){
			sFlag=true;
		}
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int scCount=0;
		for(int i=0;i<s.length()-1;i++){
			Character a = s.charAt(i);
			if(Character.isUpperCase(a)){
				uCount++;
			}
			if(Character.isLowerCase(a)){
				lCount++;
			}
			if(Character.isDigit(a)){
				dCount++;
			}
			if(!Character.isLetterOrDigit(a)||!Character.isSpace(a)){
				for(int d=0;d<c.length;d++){
					if(a.equals(c[d])){
						scCount++;
						break;
					}
				}
			}
		}
		if(scCount>0&&dCount>0&&lCount>0&&uCount>0&&lFlag&&sFlag){
			System.out.println("The Given string is a valid password :"+s);
			flag=true;
		}else{
			System.out.println("The Given string is not a valid password :"+s);
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValidPassword("sandeep@12");
	}

}

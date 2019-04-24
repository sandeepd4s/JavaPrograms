package sample;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "NitiN";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(s)){
			System.out.println("Given String : "+s+" is polyndrom");
		}
		if(!rev.equals(s)){
			System.out.println("Given String : "+s+" is not polyndrom");
		}

	}

}

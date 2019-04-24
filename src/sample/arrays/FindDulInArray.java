package sample.arrays;

public class FindDulInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"sandeep","vivek","raj","sandeep","Viv","Sandeep","raj","sud","vivek","sandeep"};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j])&&(i!=j)){
					System.out.println("Duplicated values are : "+arr[i]);
				}
			}
		}

	}

}

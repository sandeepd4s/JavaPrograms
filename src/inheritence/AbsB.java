package inheritence;

public class AbsB extends Abs{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("This is a() in AbsB");
	}
	
	public void b(){
		System.out.println("b() in AbsB");
	}
	
	public static void main(String[] args){
		Abs a = new AbsB();
		
		a.a();
		a.b();
	}

}

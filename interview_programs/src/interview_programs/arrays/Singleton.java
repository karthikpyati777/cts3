package interview_programs.arrays;

public class Singleton {

	public static void main(String[] args) {
		
		B obj1=B.getInstance();
		B obj2=B.getInstance();
	}
	
}


class B{
	
	static B obj=new B();
	
	private B() {
		
	}
	
	public static B getInstance() {
		return obj;
	}
}
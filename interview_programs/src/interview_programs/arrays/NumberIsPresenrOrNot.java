package interview_programs.arrays;

public class NumberIsPresenrOrNot {
	
	public static void main(String[] args) {
		
		int a[]= {2,3,1,4,7,6};
		boolean contains=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==4)
				contains=true;
			break;
		}
		if(contains)
			System.out.println("array contain number is 10");
		else
			System.out.println("Array does not contain number ");
		
	}

}

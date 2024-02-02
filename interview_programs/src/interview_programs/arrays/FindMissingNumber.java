package interview_programs.arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,6,5,4,7,8,9,10};
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in the array : " +sum1);

		for(int i=1;i<=10;i++) {
			
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements in the array : "+sum2);
		
		System.out.println("Missing element is : " +(sum2-sum1));
	}

}

package interview_programs.arrays;

public class FindLargestAndSmallestInUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,5,1,8,10,18};
		int small=arr[0];
		int large=arr[0];
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		
		System.out.println("Small number is : "+small);
		System.out.println("large number is : "+large);
	}

}

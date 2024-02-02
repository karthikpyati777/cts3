package com.interview.qustions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,4,2,6,5};
		
		int totalsum= 6*7/2;
		
		int actualsum=0;
		
		for(int i=0;i<arr.length;i++) {
			
		 actualsum=actualsum+arr[i];
		}
		
		System.out.println("missing number is  : " + (totalsum-actualsum));
	}

}

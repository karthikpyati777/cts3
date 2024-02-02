package com.interview.qustions;

public class CountTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5};
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//			count++;
//		}
//		System.out.println();
//		System.out.println("total number of digits is : " + count);
		
		int i=12345;
//		String str=Integer.toString(i);
//		System.out.println(str.length());
		
		int count=0;
		while(i>0) {
		
			 i=i/10;
			 count++;
		}
		System.out.println("total number of digits is : "+count);
	}

}

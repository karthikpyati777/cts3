package interview_programs.arrays;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		   
		System.out.println("Enter the size of the array");
		
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter array elements ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array Elements are");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}


	}

}

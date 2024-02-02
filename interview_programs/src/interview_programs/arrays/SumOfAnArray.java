package interview_programs.arrays;

import java.util.Scanner;

public class SumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("enter the number of elements we want to store");
		
		int n=s.nextInt();
		
		//create an array to store elements in th memory
		
		int[] a=new int[n];
		
		System.out.println("enyter the elements");
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sum of the array");
		
		for(int i=0;i<a.length;i++) {
		
			sum=sum+a[i];
			
			
			
		}
		
		System.out.println(sum);
		
	}

}

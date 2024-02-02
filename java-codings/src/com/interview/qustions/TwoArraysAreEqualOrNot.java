package com.interview.qustions;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {1,4,2,3};
		int arr2[]= {1,3,4,2};
	
		boolean isEqual=true;
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				isEqual=false;
			break;
			}
		}
		
		if(isEqual) {
			System.out.println("TWO ARRAYS ARE EQUAL");
		}
		else {
			System.out.println("TWO ARRAYS ARE NOT EQUAL");
		}
	}
	
}



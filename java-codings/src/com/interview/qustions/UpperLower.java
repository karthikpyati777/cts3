package com.interview.qustions;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="KARTHIK pavan";
		
		int mid=str.length()/2;
		
		String upperCase="";
		String lowerCase="";
		System.out.println(mid);
		
		for(int i=0;i<str.length();i++) {
			if(i< mid) {
				lowerCase+=Character.toLowerCase(str.charAt(i));
			}else {
				upperCase+=Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lowerCase + upperCase);
	}

}

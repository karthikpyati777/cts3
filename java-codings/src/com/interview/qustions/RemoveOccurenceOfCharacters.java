package com.interview.qustions;

public class RemoveOccurenceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="CloudTech";
		String s=str.toLowerCase();
		char ch='C';
		removecharcter(str, ch);
	//	System.out.println(s.replaceAll("c", ""));
	}

	public static void removecharcter(String str,char ch) {
		
		int strlen=str.length();
		
		String finalString="";
		
		for(int i=0;i<strlen;i++) {
			if(str.charAt(i)!=ch) {
				finalString=finalString+str.charAt(i);
			}
		}
		System.out.println(finalString);
	}
}

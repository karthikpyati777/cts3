package com.interview.qustions;

public class EvenOrNot {
	
	public static void evenOrOdd(int n) {
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("Odd");
	}
	
	public static void main(String[] args) {
		evenOrOdd(6);
		evenOrOdd(7);
		evenOrOdd(31);
		evenOrOdd(73);
		evenOrOdd(1010);
		evenOrOdd(4002);
	}

}

package org.ssglobal.training.codes.itemA;

public class MinimumNumber {
	public static void main(String[] args) {
		int a = 7;
		int b = 42;
		int smaller = minimum(a, b);
		
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else {
			System.out.println("b is the smallest!");
		}
	}

	public static int minimum(int a, int b) {
		// returns which int is smaller
		if ( a < b) {
			return a;
		} else {
			return b;
		}
	}
}

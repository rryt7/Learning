package com.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacci(7);
	}

	private static void fibonacci(int n) {
		int a = 1, b= 1;
		System.out.print(a);
		System.out.print(" "+b);
		for(int i=1; i<n-1; i++) {
			int e = a + b;
			System.out.print(" "+e);
			a = b;
			b = e;
		}
		
	}

}

package com.fibonacci;

public class Fibonacci3 {

	public static void main(String[] args) {
		fibonacci(7);
	}

	private static void fibonacci(int n) {
		int a = 1, b= 1, c=1;
		System.out.print(a);
		System.out.print(" "+b);
		System.out.print(" "+c);
		for(int i=1; i<n-1; i++) {
			int e = a + b + c;
			System.out.print(" "+e);
			a = b;
			b = c;
			c = e;
		}
		
	}

}

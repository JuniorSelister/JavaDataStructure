package com.selister.sortalgorithms;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(4));
		System.out.println(recursiveFactorial(3));
		
	}
	
	public static int recursiveFactorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * recursiveFactorial(num - 1);
		
	}

}

package com.selister.sortalgorithms;

public class Challenge2 {

	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		
		recursiveInsertion(intArray, intArray.length);
		
		for(int i = 0; i< intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}
	
	public static void recursiveInsertion(int[] intArray, int n) {
		
		if(n < 2) {
			return;
		}
		
		recursiveInsertion(intArray, n - 1);
		
		
		int newElement = intArray[n - 1];

		int i;
		for(i = n - 1; i > 0 && intArray[i - 1] > newElement; i--) {
			intArray[i] = intArray[i - 1];
		}
		
		intArray[i] = newElement;
		
		
	}

}

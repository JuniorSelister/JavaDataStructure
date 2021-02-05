package com.selister.sortalgorithms;

public class CountingSort {

	public static void main(String[] args) {
		// NOT an in-place algorithm
		// O9n) - can achieve this because we're making
		// assumptions about the data we're sorting
		// If we want to sort to be stable, we have to do
		// some extra steps
		
		int[] intArray = { 2, 5, 9, 8, 2 , 8, 7, 10, 4, 3};
		
		countingSort(intArray, 1, intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}
	
	public static void countingSort(int[] input, int min, int max) {
		
		int[] countArray = new int[(max - min) + 1];
		
		for(int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}
		
		int j = 0;
		for(int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
		
	}

}

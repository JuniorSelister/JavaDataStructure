package com.selister.sortalgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		for(int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			swap(intArray, largest, lastUnsortedIndex);
		}
		
		for(int value : intArray) {
			System.out.print(value + " ");
		}

	}

	public static void swap(int[] array, int i, int j) {
		
		if(array[i] == array[j]) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
}

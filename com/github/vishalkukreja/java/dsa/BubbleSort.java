/**
 * 
 */
package com.github.vishalkukreja.java.dsa;

import java.util.Arrays;

/**
 * @author Vishal
 * 
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArr = {99, 32, 55, 12, 25, 118, 0, 15, 78, 11, 76, 44 };
		System.out.println("Sorted data : " + Arrays.toString(BubbleSort.bubbleSort(intArr)));
	}

	/**
	 * Sort input array of integer in bubble sort way
	 * 
	 * @param inputArr
	 * @return sorted numbers
	 */
	public static int[] bubbleSort(int[] inputArr) {
		int temp;
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = 1; j < inputArr.length - i; j++) {
				if (inputArr[j-1] > inputArr[j]) {
					temp = inputArr[j - 1];
					inputArr[j-1] = inputArr[j];
					inputArr[j] = temp;
				}
			}
			System.out.println("Pass # " + (i + 1) + ": "
					+ Arrays.toString(inputArr));
		}
		return inputArr;
	}

}

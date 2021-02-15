package february2021;

import java.util.Arrays;

public class D15 {

	/*
	 * Given an array of integers, return a new array such that each element at
	 * index i of the new array is the product of all the numbers in the original
	 * array except the one at i.
	 * 
	 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
	 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
	 * be [2, 3, 6]
	 */

	private static int[] productArray(int[] array) {
		int[] mem = new int[array.length];
		int totalSum = 1;

		for (int i = 0; i < array.length; i++) {
			totalSum *= array[i];
		}

		for (int j = 0; j < array.length; j++) {
			mem[j] = totalSum / array[j];
		}

		return mem;
	}

	// Follow-up: what if you can't use division?

	private static int[] productArrayWithoutDivision(int[] array) {
		int[] mem = new int[array.length];
		int totalSum = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j != i) {
					totalSum = totalSum * array[j];
				}
			}
			mem[i] = totalSum;
			totalSum = 1;
		}
		return mem;
	}

	public static void main(String[] args) {

		int[] numeros = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(productArrayWithoutDivision(numeros)));

	}

}

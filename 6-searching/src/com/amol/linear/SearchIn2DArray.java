package com.amol.linear;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		int target = 7;

		System.out.println("Position of target : " + Arrays.toString(searchIn2DArray(arr, target)));
		System.out.println("Max of Array: " + maxIn2DArray(arr));
	}

	static int[] searchIn2DArray(int[][] arr, int target) {

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c] == target) {
					return new int[] { r, c };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	static int maxIn2DArray(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] ints : arr) {
			for (int element : ints) {
				if (element > max) {
					max = element;
				}
			}
		}
		return max;

	}
}

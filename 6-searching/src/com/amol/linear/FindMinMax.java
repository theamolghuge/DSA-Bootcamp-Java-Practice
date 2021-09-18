package com.amol.linear;

public class FindMinMax {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Minimum number : " + findMin(arr));
		System.out.println("Maximum number : " + findMax(arr));
	}

	static int findMax(int[] arr) {
		int max = arr[0];
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int findMin(int[] arr) {
		int min = arr[0];
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}

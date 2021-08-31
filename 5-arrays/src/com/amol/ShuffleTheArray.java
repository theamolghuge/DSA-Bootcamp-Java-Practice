package com.amol;

import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int n = 3;
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		System.out.println(Arrays.toString(shuffle(nums, n)));
	}

	static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];

		for (int i = 0, j = 0, k = n; i < 2 * n && j < 2 * n && k < 2 * n; i++) {
			if (i % 2 == 0) {
				result[i] = nums[j];
				j++;
			}

			else {
				result[i] = nums[k];
				k++;
			}
			System.out.println(Arrays.toString(result));
		}

		return result;
	}
}

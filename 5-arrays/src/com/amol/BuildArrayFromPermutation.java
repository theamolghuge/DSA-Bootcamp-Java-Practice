package com.amol;

import java.util.Arrays;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		System.out.println(Arrays.toString(buildArray(nums)));

	}

	static int[] buildArray(int[] nums) {
		int[] ans = nums;
		int[] temp = nums;
		int[] sample = new int[ans.length];

		for (int i = 0; i < nums.length; i++) {	
			temp[i] = nums[i];
			sample[i]= nums[temp[i]];
		}
		return sample; // 0,1,2,4,5,3
	}
}

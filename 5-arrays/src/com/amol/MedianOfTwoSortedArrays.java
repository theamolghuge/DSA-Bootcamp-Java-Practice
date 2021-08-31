package com.amol;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2, 4 };

		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

	static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double[] result = new double[nums1.length + nums2.length];
		int half = 0;
		double ans = 0;
		for (int i = 0; i < nums1.length; i++) {
			result[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			result[i + nums1.length] = nums2[i];
		}
		Arrays.sort(result);
		half = result.length / 2;
		if (result.length % 2 == 0) {
			ans = (result[half] + result[half - 1]) / 2;
		} else {
			ans = result[half];
		}
		return ans;
	}
}

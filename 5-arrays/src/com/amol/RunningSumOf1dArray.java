package com.amol;

import java.util.Arrays;

public class RunningSumOf1dArray {

	 static int[] runningSum(int[] nums) {
	        int[] runningSum = nums;
	        for(int i=1; i<nums.length; i++){
	            runningSum[i]= nums[i]+nums[i-1];
	        }
	        return runningSum;
	    }
	 
	 public static void main(String[] args) {
		 int [] nums = {1, 2, 3, 4};
		System.out.println("Running Sum "+Arrays.toString(runningSum(nums)));
	}

}

   
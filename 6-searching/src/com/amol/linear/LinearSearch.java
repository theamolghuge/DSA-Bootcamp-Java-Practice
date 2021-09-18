package com.amol.linear;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90,100};
		int target = 70;
		int ans = linearSearch(arr, target);
		System.out.println(ans);

	}
	
	static int linearSearch(int [] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i =0; i< arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}

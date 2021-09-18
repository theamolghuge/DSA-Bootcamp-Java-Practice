package com.amol.linear;

public class SearchInRange {

	public static void main(String[] args) {
		
		int [] arr = {18, 12, -7, 3, 14, 28};
		int target = 18;
		int start = 1;
		int stop = 4;
		//search for 3 in the range [1, 4]
		int ans = searchInRange(arr, target, start, stop);
		System.out.println(ans);
	}
	
	static int searchInRange(int[]arr, int target,int start,int stop) {
		for(int i = start; i<= stop; i++) {
			if(arr[i]==target) {
				return i;
			}
		}		
		return -1;
	}
}

package com.amol.linear;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int [][] accounts = {
				{1,2,3},
				{3,4,5},
				{5,6,7}
		};
		
		System.out.println("Maximum Wealth "+maximumWealth(accounts));
	}
	
	static int maximumWealth(int[][] accounts) {
    	int[] sum = new int[accounts.length];
		int max_wealth = 0;
		for (int i = 0; i < accounts.length; i++) {
			int temp=0;
			for (int j = 0; j < accounts[i].length; j++) {
				temp = temp + accounts[i][j];
			}
			sum[i]=temp;
            if (sum[i] > max_wealth) {
				max_wealth = sum[i];
			}
		}
		
		return max_wealth;
	}
}

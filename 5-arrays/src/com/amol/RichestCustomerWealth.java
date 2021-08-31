package com.amol;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };

		System.out.println(maximumWealth(accounts));

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

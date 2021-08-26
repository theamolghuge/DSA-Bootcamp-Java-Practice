//Write a function that returns the sum of first n natural numbers.

package com.amol;

import java.util.Scanner;

public class SumOfNNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Sum is " + nNaturalNums(n));
		sc.close();
	}

	private static int nNaturalNums(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

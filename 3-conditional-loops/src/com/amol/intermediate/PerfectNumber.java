//Perfect Number In Java

package com.amol.intermediate;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is Perfect number");
		} else {
			System.out.println(num + " is not Perfect number");
		}
		sc.close();
	}
}

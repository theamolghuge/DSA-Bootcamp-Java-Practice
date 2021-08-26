//Write a function that returns all prime numbers between two given numbers.

package com.amol;

import java.util.Scanner;

public class PrimeNosBw2Nums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		primeInBetween(x, y);
		sc.close();
	}

	private static void primeInBetween(int x, int y) {
		for(int i = x; i <= y; i++) {
			int flag =0;
			for(int j = 2; j < Math.sqrt(y);j++) {
				if(i%j==0) {
					flag =  1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
}
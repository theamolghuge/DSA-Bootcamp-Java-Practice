//Power In Java

package com.amol.intermediate;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("Enter the Power: ");
		int power = sc.nextInt();
		int ans = 1;
		for (int i = 0; i < power; i++) {
			ans = num * ans;
		}
		System.out.println("Power of "+num+" is "+ans);
		sc.close();
	}
}

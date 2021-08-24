//Write a program to print whether a number is even or odd, also take input.

package com.amol;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		oddOrEven(n);
		sc.close();
	}
	static void oddOrEven(int n) {
		if(n%2==0)
			System.out.println(n+" is even number.");
		else
			System.out.println(n+" is odd number");
	}
}

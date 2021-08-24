//Write a program to print factorial of a number, also take input.

package com.amol;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		int x=1;
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		while(n!=1) {
//			x=n*x;
//			n--;
//		}
//		System.out.println("Factorial is : "+x);
		System.out.println("Factorial of "+n +" is "+factorial(n));
		sc.close();
	}
	
	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}
}

//Take two numbers and print the sum of both.

package com;

import java.util.Scanner;

public class SumOf2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int x = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int y = sc.nextInt();
		
		System.out.println("The Sum of 2 numbers is "+sum(x,y));
	}

	private static int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}

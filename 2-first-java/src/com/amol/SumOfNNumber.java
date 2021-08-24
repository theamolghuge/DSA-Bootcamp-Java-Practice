//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package com.amol;

import java.util.Scanner;

public class SumOfNNumber {

	public static void main(String[] args) {
		int num;
		int sum=0;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		do {
			num = sc.nextInt();
			sum= sum+num;
		}while(num!=0);
		System.out.println("Sum is "+sum);
		sc.close();
	}
}

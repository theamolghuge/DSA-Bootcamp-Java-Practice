/*Write a program to print the sum of negative numbers, 
sum of positive even numbers and the sum of positive odd
numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.
*/

package com.amol.intermediate;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int sumOfeven = 0;
		int sumOfNegative = 0;
		int sumOfOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num;
		do {
			num = sc.nextInt();
			if (num < 0) {
				sumOfNegative = sumOfNegative + num;
			} else if (num % 2 == 0) {
				sumOfeven = sumOfeven + num;
			} else if (num % 2 != 0) {
				sumOfOdd = sumOfOdd + num;
			}

		} while (num != 0);
		sc.close();
		System.out.println("Sum Of Even numbers: "+sumOfeven);
		System.out.println("Sum Of Odd numbers: "+sumOfOdd);
		System.out.println("Sum Of negative numbers: "+sumOfNegative);
	}
	
}

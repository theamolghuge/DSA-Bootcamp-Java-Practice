//Find if a number is palindrome or not

package com.amol.intermediate;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int othernum = 0;
		do {
			othernum = othernum * 10 + temp % 10;
			temp = temp / 10;
		} while (temp != 0);
		sc.close();
		if(num == othernum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}

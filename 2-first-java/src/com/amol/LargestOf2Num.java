//Take 2 numbers as input and print the largest number.

package com.amol;

import java.util.Scanner;

public class LargestOf2Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int x = sc.nextInt();
		System.out.println("Enter num2: ");
		int y = sc.nextInt();
		if(x>y) {
			System.out.println(x+" is greater than "+y);
		}
		else if(x<y) {
			System.out.println(x+" is less than "+y);
		}
		else {
			System.out.println(x+" is equal to "+y);
		}
		sc.close();
	}
}

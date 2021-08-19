//Add numbers until user press 0
package com;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int x = 0,sum = 0;
		do{
			x = sc.nextInt();
			sum = sum + x;
		}while(x!=0);
		System.out.println("Sum : "+sum);
	}
}

//Factorial Program In Java

package com.amol.intermediate;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for factorial: ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));
		sc.close();
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 1;
		}
		while(num!=0) {
			return factorial(num-1)*num;
		}
		return 0;
	}
}

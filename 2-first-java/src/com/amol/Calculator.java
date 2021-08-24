//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.amol;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = sc.nextInt();
		System.out.println("Enter num2: ");
		int b = sc.nextInt();
		System.out.println("Enter Operator (+,-,/,*): ");
		String s = sc.next();
		char op = s.charAt(0);
		if(op=='+'||op=='-'||op=='*'||op=='/') {
			System.out.println("Sum :"+calculator(a, b, op));
		}
		else {
			System.out.println("Enter valid Operator.");
		}
		sc.close();
	}

	private static int calculator(int a, int b, char op) {
		// TODO Auto-generated method stub
		int ans = 0;
		if(op=='+') 
			ans = a+b;
		else if(op=='-')
			ans = a-b;
		else if(op=='*')
			ans = a*b;
		else if(op=='/') {
			if(b!=0) {
				ans = a/b;
			}			
			else {
				System.out.println("The number can't be divided by zero.");
			}
		}
		else {
			System.out.println("Invalid Input.");
		}
		return ans;
	}
}

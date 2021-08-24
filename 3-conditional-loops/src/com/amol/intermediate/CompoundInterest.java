//Compound Interest Java Program

package com.amol.intermediate;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Principle amount: ");
		int p = sc.nextInt();
		System.out.println("Enter Interest Rate: ");
		float r = sc.nextInt()/100f;
		System.out.println("Enter no of Years: ");
		int t = sc.nextInt();
		int n = 12;
		double a = p * Math.pow((1+(r/n)), n*t);
		
		System.out.println("Compounded Return " +a);
		sc.close();
		
	}
}

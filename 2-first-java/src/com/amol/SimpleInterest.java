//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

package com.amol;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle: ");
		int p = sc.nextInt();
		System.out.print("Enter Time: ");
		int t = sc.nextInt();
		System.out.print("Enter Rate: ");
		int r = sc.nextInt();	
		System.out.println("Simple Interest : "+simpleInterest(p, t, r));
		sc.close();
	}
	static int simpleInterest(int p, int t, int r) {
		int si;
		si = p*t*r/100;
		return si;
	}
}

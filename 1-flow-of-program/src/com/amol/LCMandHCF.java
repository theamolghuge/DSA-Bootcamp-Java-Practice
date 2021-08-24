package com.amol;

import java.util.Scanner;

public class LCMandHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int num = Math.min(a, b);
		for (int i = num; i > 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i + "is HCF for " + a + " and " + b);
				return;
			} else {
				System.out.println("There is no HCF");
			}
		}
		for (int i = 2; i <= num; i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i+" is LCM");
			}
			else {
				System.out.println("There is no LCM");
			}
		}
	}

}

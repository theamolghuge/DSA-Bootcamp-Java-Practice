//Find Ncr & Npr

package com.amol.intermediate;

import java.util.Scanner;

public class PermutationAndCombination {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		System.out.println("Enter r : ");
		int r = sc.nextInt();
		System.out.println("1. Permutation");
		System.out.println("2. Combination");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			permutation(n,r);
			break;
		case 2: 
			combination(n,r);
			break;
		}
		sc.close();
	}

	static void permutation(int n, int r) {
		// TODO Auto-generated method stub
		double nPr = factorial(n)/factorial(n-r);
		System.out.println("nPr : "+nPr);
		
	}

	static void combination(int n, int r) {
		// TODO Auto-generated method stub
		double nCr = factorial(n)/(factorial(r)* factorial(n-r));
		System.out.println("nCr : "+nCr);
		
	}
	
	static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		while(num!=0) {
			return factorial(num-1)*num;
		}
		return 0;
		
	}
}

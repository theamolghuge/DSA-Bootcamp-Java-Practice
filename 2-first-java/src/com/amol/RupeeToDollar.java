//Input currency in rupee and output in dollar.

package com.amol;

import java.util.Scanner;

public class RupeeToDollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		float x = sc.nextFloat();
		System.out.println("Dollar value of "+x+" rs is "+(x/74.35));
		sc.close();
	}
}

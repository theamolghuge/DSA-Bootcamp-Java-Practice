package com.amol;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int y = sc.nextInt();
		for (int i = 1; i <= 10; i++)
			System.out.println(y + " x " + i + " = " + i * y);
		sc.close();
	}
}

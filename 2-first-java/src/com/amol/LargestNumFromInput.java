//Take integer inputs till the user enters 0 and print the largest number from all.

package com.amol;

import java.util.Scanner;

public class LargestNumFromInput {
	
	public static void main(String[] args) {
		int large=0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		do {
			num = sc.nextInt();
			if(num>large)
				large = num;
		}while(num!=0);
		sc.close();
		System.out.println("Largest Num is "+large);
	}
}

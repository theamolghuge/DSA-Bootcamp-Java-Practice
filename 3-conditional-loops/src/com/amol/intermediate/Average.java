//Calculate Average Of N Numbers

package com.amol.intermediate;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int count=-1;
		int sum=0;
		int num;
		do {
			num=sc.nextInt();
			sum = sum + num;
			count++;
		}while(num>0);
		int average = sum/count;
		System.out.println("Average is "+average);
		sc.close();
	}
}

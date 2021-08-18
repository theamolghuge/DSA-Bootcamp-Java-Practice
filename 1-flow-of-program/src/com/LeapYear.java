//Input a year and find whether it is a leap year or not.

package com;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Year: ");
		Scanner sc =  new Scanner(System.in);
		int yr = sc.nextInt();
		if((yr%4==0 && yr%100!=0)|| yr%400==0) {
			System.out.println(yr +" is leap year");
		}
		else {
			System.out.println(yr+" is not leap year");
		}
		sc.close();
	}

}

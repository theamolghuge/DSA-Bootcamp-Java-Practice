//Take name as input and print a greeting message for that name.

package com.amol;

import java.util.Scanner;

public class GreetingMsg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name =sc.next();
		greet(name);
		sc.close();
	}
	
	static void greet(String s) {
		System.out.println("Welcome "+s);
	}
}

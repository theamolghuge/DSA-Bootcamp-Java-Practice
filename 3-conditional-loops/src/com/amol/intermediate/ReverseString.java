//Reverse A String In Java

package com.amol.intermediate;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String original = sc.next();
		String reverse = "";
		for(int i = original.length(); i > 0; i--) {
			reverse = reverse + original.charAt(i-1);
		}
		System.out.println("Reverse is : "+reverse);
		sc.close();
	}
}

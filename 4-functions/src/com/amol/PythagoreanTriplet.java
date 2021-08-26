/*Write a function to check if a given triplet is a Pythagorean triplet or not.
 *  (A Pythagorean triplet is when the sum of the square of two number is equal
 *   to the square of the third number).
 */
package com.amol;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if (triplet(x, y, z)) {
			System.out.println("This is Pythagoran Triplet");
		} else {
			System.out.println("This is not Pythagoran Triplet");
		}
		sc.close();
	}

	private static boolean triplet(int x, int y, int z) {
		// TODO Auto-generated method stub
		if (x > y && x > z) {
			if (y * y + z * z == x * x) {
				return true;
			}
		} else if (y > z && y > x) {
			if (y * y == z * z + x * x) {
				return true;
			}
		} else if (z > x && z > y) {
			if (z * z == x * x + y * y) {
				return true;
			}
		}

		return false;
	}
}

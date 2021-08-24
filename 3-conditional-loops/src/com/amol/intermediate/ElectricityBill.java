//Calculate Electricity Bill

package com.amol.intermediate;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		float charge = 0;
		int fixedCharge = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Meter Reading: ");
		float meterReading = sc.nextFloat();
		if(meterReading<=100) {
			charge=4.5f;
		}
		else if(meterReading<=300) {
			charge=7.65f;
		}
		else if(meterReading<=500) {
			charge=9.29f;
		}
		else if(meterReading>500) {
			charge=11.14f;
		}
		float totalCharge = fixedCharge + meterReading*charge;
		System.out.println("Your Bill Charge is "+totalCharge);
		sc.close();
	}
}

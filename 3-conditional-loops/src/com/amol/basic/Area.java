package com.amol.basic;

import java.util.Scanner;

public class Area {

	static double area;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated constructor stub
		System.out.println("***************************");
		System.out.println("1. Area Of Circle");
		System.out.println("2. Area Of Triangle");
		System.out.println("3. Area Of Rectangle Program");
		System.out.println("4. Area Of Isosceles Triangle");
		System.out.println("5. Area Of Parallelogram");
		System.out.println("6. Area Of Rhombus");
		System.out.println("7. Area Of Equilateral Triangle");
		System.out.println("***************************");

		int choice;
		System.out.println("Enter Your Choice : ");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			areaOfCircle();
			break;

		case 2:
			areaOfTriangle();
			break;

		case 3:
			areaOfRectangle();
			break;

		case 4:
			areaOfIsoscelesTriangle();
			break;

		case 5:
			areaOfParallelogram();
			break;

		case 6:
			areaOfRhombus();
			break;

		case 7:
			areaOfEquilateralTriangle();
			break;

		default:
			System.out.println("You have entered wrong choice");

		}

		sc.close();
	}

	private static void areaOfIsoscelesTriangle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		float b =  sc.nextFloat();
		System.out.println("Enter Height: ");
		float h = sc.nextFloat();
		area = b*h/2;
		System.out.println("Area of Isosceles triangle is "+area);
		sc.close();
	}

	private static void areaOfParallelogram() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		float b = sc.nextFloat();
		System.out.println();
		float h = sc.nextFloat();
		area = b*h;
		System.out.println("Area of Parallelogram is "+area);
		sc.close();
	}

	private static void areaOfRhombus() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Diagonal 1 : ");
		float a = sc.nextFloat();
		System.out.println("Enter Diagonal 2 : ");
		float b = sc.nextFloat();
		area = a*b/2;
		System.out.println("Area of Rhombus is "+area);
		sc.close();
	}

	private static void areaOfEquilateralTriangle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of triangle: ");
		float s = sc.nextFloat();
		area = (Math.cbrt(3)/4)*s*s;
		System.out.println("Area of Equilateral Triangle is "+area);
		sc.close();
	}

	private static void areaOfRectangle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		float l = sc.nextFloat();
		System.out.println("Enter breath: ");
		float b = sc.nextFloat();
		area = l*b;
		System.out.println("Area of Rectangle is "+area);
		sc.close();
	}

	private static void areaOfTriangle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		float h = sc.nextFloat();
		System.out.println("Enter Base: ");
		float b = sc.nextFloat();
		area = 0.5 * h * b;
		System.out.println("Area of Triangle is "+area);
		sc.close();
	}

	private static void areaOfCircle() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = sc.nextDouble();
		area = 2 * 3.14 * r;
		System.out.println("Area of Circle: " + area);
		sc.close();
	}

}

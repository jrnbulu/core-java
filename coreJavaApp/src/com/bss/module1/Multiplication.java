package com.bss.module1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int x,y,product;//variable declaration
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number:");
		x=sc.nextInt();
		System.out.print("enter the second number:");
		y=sc.nextInt();
		System.out.println("The product of given two numbers is: "+getMultiplicationOfNumbers(x,y));
		// TODO Auto-generated method stub

	}
	public static int getMultiplicationOfNumbers(int x,int y)
	{
		return x*y;
	}

}


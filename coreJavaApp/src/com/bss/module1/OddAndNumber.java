package com.bss.module1;

import java.util.Scanner;

public class OddAndNumber {

	public static void main(String[] args) {
		int num, i, r;
		System.out.print("enter the number here:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (i = 0; i <= num; i++) {
			r = i % 2;
			if (r == 0)
				System.out.println("enter number is even:"+i);
			else
				System.out.println("enter number is odd:"+i);
		}

	}
}

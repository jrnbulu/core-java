package com.bss.module1;

import java.util.Scanner;

public class SumOfNumbersInRange {

	public static void main(String[] args) {
			int start,end;
			if(args.length > 1)
			{
				start = Integer.parseInt(args[0]);
				end = Integer.parseInt(args[1]);
				System.out.println("Input from command line array: start :"+args[0]+" and end:"+args[1]);
				System.out.println("After adding numbers in given range:"+getSumOfNumbers(start,end));
			}			
			Scanner sc=new Scanner(System.in);
			start=sc.nextInt();
			end=sc.nextInt();
			System.out.println("Input from scanner: start :"+start+" and end:"+end);
			System.out.println("After adding numbers in given range:"+getSumOfNumbers(start,end));
	}
	public static int getSumOfNumbers(int startNum,int endNum)
	{
		int i,sum=0;
		for(i=startNum;i<=endNum;i++)
		{
			sum +=i;
		}
		return sum;
	}

}

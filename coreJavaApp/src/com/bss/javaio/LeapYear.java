package com.bss.javaio;
import java.io.*;
public class LeapYear {

	public static void main(String[] args)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter year no:");
		int year =Integer.parseInt(br.readLine());
		if(year % 100 == 0 && year % 400 == 0)
			System.out.println("It is a leap year");
		else if(year % 100 != 0 && year % 4 == 0)
		System.out.println("it is leap year");
		else
		 System.out.println("it is not leap year");	

	}

}
package com.bss.module1;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String x="Madam";
		int i=0,j=x.length()-1;
		while(i<j)
		{
			if (x.charAt(i)!=x.charAt(j))
			{
				System.out.print("Not Pallindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.print("pallindrome");

	}

}

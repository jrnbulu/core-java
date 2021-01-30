package com.bss.string;

public class Immutability {

	public static void main(String[] args) {
		 String s1="Sachin";  
		   String s2=(" Tendulkar");//concat() method appends the string at the end  
		   s1=s1+s2;
		   System.out.println(s1);//will print Sachin because strings are immutable objects  
		// TODO Auto-generated method stub

	}

}

package com.bss.string;

public class GetChar {

	public static void main(String[] args) {
		String str = " Hello,this is a book on java ";
		char arr[ ] =new char[20];
		str.getChars(7,21,arr,0);
		System.out.println(arr);
		
		
	}

}

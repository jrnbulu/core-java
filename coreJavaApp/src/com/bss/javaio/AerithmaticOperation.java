package com.bss.javaio;
import java.io.*;
import java.util.*;
public class AerithmaticOperation {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("s1,s2:");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		double n1=Double.parseDouble(s1);
		double n2=Double.parseDouble(s2);
		System.out.println("result of addition: "+(n1+n2));
		System.out.println("result of subtraction: "+(n1-n2));
		System.out.println("result of multiplication: "+(n1*n2));
		System.out.println("result of division: "+(n1/n2));
		
		// TODO Auto-generated method stub

	}

}

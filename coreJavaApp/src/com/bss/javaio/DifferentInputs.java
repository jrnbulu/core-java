package com.bss.javaio;
import java.io.*;
import java.util.*;

public class DifferentInputs {

	public static void main(String[] args)  throws IOException 
    { 
  
        // InputStreamReader class to read input 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter name,age,salary: ");
       //accept the input in a string
       String str=br.readLine();
       //sttringTokenizer used to break the input at commas
       StringTokenizer st = new StringTokenizer(str, ",");
       String s1=st.nextToken();
       String s2=st.nextToken();
       String s3=st.nextToken();
       //trim any spaces before and after the tokens
       s1 =s1.trim();
       s2 =s2.trim();
       s3 =s3.trim();
       //convert s1 into string,s2 into an int and s3 into float
       String name=s1;
       int age=Integer.parseInt(s2);
       float sal= Float.parseFloat(s3);
       System.out.println("Name=" +name);
       System.out.println("Age= "+age);
       System.out.println("salary= "+sal);
		// TODO Auto-generated method stub

	}

}

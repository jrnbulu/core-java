package com.bss.javaio;
import java.io.*;
public class AcceptAndDisplay {

	public static void main(String[] args) throws IOException 
    { 
  
        // InputStreamReader class to read input 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter a character:");
       char ch= (char)br.read();
       System.out.print("you entered: "+ch);
   
		// TODO Auto-generated method stub

	}

}

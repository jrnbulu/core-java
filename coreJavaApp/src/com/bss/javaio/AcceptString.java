package com.bss.javaio;
import java.io.*;
public class AcceptString {

	public static void main(String[] args)  throws IOException 
    { 
  
        // InputStreamReader class to read input 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter a name:");
       String name= br.readLine();
       System.out.print("you entered: "+name);
		// TODO Auto-generated method stub

	}

}

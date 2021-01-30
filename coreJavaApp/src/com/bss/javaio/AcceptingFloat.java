package com.bss.javaio;
import  java.io.*;
public class AcceptingFloat {

	public static void main(String[] args)  throws IOException 
    { 
  
        // create a BufferReader  object to accept data from keyboard
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //ask for float and read it
       System.out.print("enter a float value:");
       float num= Float.parseFloat(br.readLine());
      //display int
       System.out.print("you entered: "+num);
	
	}

}

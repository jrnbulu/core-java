package com.bss.javaio;
import java.io.*;
public class AcceptingInteger {

	public static void main(String[] args)  throws IOException 
    { 
  
        // create a BufferReader  object to accept data from keyboard
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //ask for integer and read it
       System.out.print("enter an int value:");
       int num= Integer.parseInt(br.readLine());
      //display int
       System.out.print("you entered: "+num);
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	}

}

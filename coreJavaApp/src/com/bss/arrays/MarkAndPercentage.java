package com.bss.arrays;
import java.io.*;
public class MarkAndPercentage {

	public static void main(String[] args)throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //ask how many subject
		 System.out.println("how many subjects ?");
		 int n=Integer.parseInt(br.readLine());
		 int[] marks=new int[n];
		 //store the element in the array
		 for(int i=0;i<n;i++) {
			 System.out.println("enter the marks:");
		 marks[i]=Integer.parseInt(br.readLine());}
		
		 //total mark
		  int  tot=0;
		  for(int i=0;i<n;i++)
			  tot=tot+marks[i];
		  System.out.println("Total marks= "+ tot);
		  float percent =(float)tot/n;
		  System.out.println("percentage= "+percent);
		  
	}

}

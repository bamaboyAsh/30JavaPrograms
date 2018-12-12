package com.w3package;
// Write a Java program to create a new string taking first and last characters from two given strings. 
//If the length of either string is 0 use "#" for missing character

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str1= in.nextLine();
		
		System.out.println("Enter the second string");
		String str2 = in.nextLine();
		
		in.close();
		
		String newString="";
		
		if(str1.length()==0)
		{
			
			str1="#";
		}
		else if(str2.length()==0)
		{
			str2= "#";
		}
		
		else if(str1.length()>0 && str2.length()>0)
		{
			;
			System.out.println(newString= str1.substring(0, 1)+str2.substring(str2.length()-1,str2.length()));
		}
	}

}

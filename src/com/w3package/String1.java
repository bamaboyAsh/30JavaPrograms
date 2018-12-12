package com.w3package;
//Write a Java program to create a new string taking first three characters from a given string. 
//If the length of the given string is less than 3 use "#" as substitute characters

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		
		sc.close();
		
		int length= str.length();
		
		if(length>3)
		{
			System.out.println(str.substring(0, 3));
		}
		else if(length == 1)
		{
			System.out.println(str.concat("##"));
		}
		else if(length==2)
		{
			System.out.println(str.concat("#"));
		}
	}

}

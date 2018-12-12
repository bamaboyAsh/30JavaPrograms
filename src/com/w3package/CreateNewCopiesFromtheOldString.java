package com.w3package;
//Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. 
//The length of the original string must be 3 and above.
public class CreateNewCopiesFromtheOldString 
{

	public static void main(String[] args) 
	{
		
		String main_line= "Java 1.8";
		
		//logic to write here is 
		// create copy of last 3 char
		String last_three_chars= main_line.substring(main_line.length()-3);
		
		System.out.println(last_three_chars+ last_three_chars+ last_three_chars);
	}

	
}

package com.w3package;
//Write a Java program to create a string in the form short_string + long_string + short_string 
//from two strings. The strings must not have the same length.
//Test Data: Str1 = Python
//Str2 = Tutorial

public class StringFormatPrint_usingTwoStrings {

	public static void main(String[] args) 
	{
		String str1= "Python";
		String str2= "tutorial";
	
		String longString ="";
		String shortString="";
		
		if((str1.length()!= str2.length()) && (str1.length()>str2.length()))
		{
				longString = str1;
				shortString= str2;
		}
		else if(str1.length()!= str2.length())
		{
			longString = str2;
			shortString = str1;
		}
		
		System.out.println(shortString+" "+longString+" "+shortString);
	}

}

package com.w3package;
//Write a Java program to create the concatenation of the two strings except removing the first character 
//of each string. The length of the strings must be 1 and above.

//Test Data: Str1 = Python
//Str2 = Tutorial
//Sample Output: ythonutorial 


public class Concate2Strings {

	public static void main(String[] args) {
		
		String test_data= "Python";
		String str2= "Tutorial";
		
		//Concate two strings except removing the first char of each string
		
		System.out.println(test_data.substring(1)+str2.substring(1));
	}

}

package coding.inteview.programs;

import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.


public class CountCharSpaceNum {

	public static void main(String[] args) 
	{
		int letter=0, space=0 , number=0, other=0;
		
		//using char array to save the user input
		char [] input = new char[100];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence to check");
		// using a char array to save the input in.
		input= sc.nextLine().toCharArray();
		sc.close();
		
		//now logic to check each index and comapare the char.
		
		for(int i=0; i<input.length; i++)
		{
			if(Character.isLetter(input[i]))
			{
				letter++;
			}
			else if(Character.isWhitespace(input[i]))
			{
				space++;
			}
			else if(Character.isDigit(input[i]))
			{
				number++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Letters in the string are "+letter+ 
							" \n Numbers in the string are "+number+
							"\n Space in the string are "+space+
							" \n Other char in the string are "+other);
		
	}

}

package coding.inteview.programs;

import java.util.Scanner;

//Reverse a string.


public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string you want to print in reverse");
		String input = sc.nextLine();
		sc.close();
		
		String reverse="";
		
		int length= input.length();
		
		for(int i=length-1; i>=0; i--)
		{
		
			reverse= reverse +input.charAt(i);
	
		}
		System.out.println("Original String  "+input+" and the reverse is "+reverse);
		
	}

}

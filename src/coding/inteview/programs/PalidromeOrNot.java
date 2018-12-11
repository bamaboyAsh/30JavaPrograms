package coding.inteview.programs;

import java.util.Scanner;

public class PalidromeOrNot 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to check if palindrome or not");
		//taking input from user.
		String input= sc.nextLine();
		sc.close();
		
		//Convert String to String buffer
		
		StringBuffer sb= new StringBuffer();
		StringBuffer reverse= new StringBuffer();
		
		
		sb.append(input);
		System.out.println("Input given by user= "+input);
		System.out.println("String converted to StringBuffer= "+sb+". Both are same");
		
		//Now reversing the string using built in Method reverse.
		
		reverse= sb.reverse();
		String rev =reverse.toString();
		
		System.out.println(sb);
		
		//A string is said to be Palindrome if and only if the reverse of the string is equal to original string
		
		if(rev.equals(input))
		{
			System.out.println("Input String "+ sb +"  is Palindrome");
		}
		else
			System.out.println("String is not plaindrome");
		
	}

}

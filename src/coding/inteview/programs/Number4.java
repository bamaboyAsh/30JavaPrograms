package coding.inteview.programs;

import java.util.Scanner;

/*Write a Java program that accepts two integer values from the user and return the larger values. 
However if the two values are the same, return 0 and return the smaller value if the two values have 
the same remainder when divided by 6.
*/
public class Number4 {
	
	public static void main(String args[])
	{
		//Take 2 integer as input from user
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		int num2= in.nextInt();
		
		in.close();
		System.out.println("Result: "+check(num1,num2));
		
	}
	 public static int check(int x, int y)
	{
		 	
			if(x==y)
			{
				return 0;
			}
			if(x % 6 == y % 6)
			    return (x < y) ? x : y;
		    return (x > y) ? x : y;
	}
}

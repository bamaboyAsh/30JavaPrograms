package coding.inteview.programs;

import java.util.Scanner;

/*
 
 Take an integer input from the user, print YES if it is prime number and NO 
 if it not a prime number.
  (Prime number is a number which is only divisible by 1 or itself).
 
*/

public class PrimeNumberOrNot 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		for(int i = 2; i < a/2; i++) 
		{
			if(a % i == 0) 
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime) 
		{
			System.out.print("YES");
		} else 
		{
			System.out.print("NO");
		}

	}
}
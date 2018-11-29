package randomProgramsForPractice;

import java.util.Scanner;

/*
 10.	Take two numbers from the user and print the result of 
 multiplication and sum of all the numbers between these two numbers.
  E.g. if user presses 3 and 8 then 4+5+6+7 is 22 and 4*5*6*7 is 840. 
  (Restrict the user such that first number must be less than 
  the second number).
 */
public class Random4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1 ");
		
		int num1= sc.nextInt();
		System.out.println("Enter num2 ");
		
		int num2=sc.nextInt();
		
		int sum=0, mul=1;

		if(num1<num2)
		{
			for(int i=num1+1; i<num2;i++)
			{					
				sum= sum+i;	
				mul= mul*i;
				
			}
		}
		System.out.println(sum);
		System.out.println(mul);
		
		
	}

}

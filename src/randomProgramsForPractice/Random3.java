package randomProgramsForPractice;
/*
 using do while print the number of digits this number contains.  
*/

import java.util.Scanner;

public class Random3 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a randome number");
		int a = sc.nextInt();
		
		int result=1;
		int q= a/10;
		while(q!=0)
		{
			q=q/10;
			result++;
		}
		System.out.println(result);
	}

}

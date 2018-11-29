package randomProgramsForPractice;

import java.util.Scanner;

/*
  Develop a program that inputs 10 different integers within a while loop 
  and displays the largest as well as smallest. (Repetition of numbers is not allowed).
 */

public class Random1 {

	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Num: 1");
		int a= sc.nextInt();
		int i= 2, small =a, large=a;
		
			while(i<=10)
			{
				System.out.println("Num "+i+":");
				int b=sc.nextInt();
				if(b<small)
				{
					small=b;
				}
				if(b>large)
				{
					large=b;
				}
				i++;
			}
			System.out.println("Large "+large+"  smaller "+small);
			
	}

}

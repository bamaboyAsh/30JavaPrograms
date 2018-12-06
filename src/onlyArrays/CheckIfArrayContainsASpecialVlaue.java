package onlyArrays;

import java.util.Scanner;

public class CheckIfArrayContainsASpecialVlaue {

	public static void main(String[] args) 
	{
		//check if array contains a special value
		
		int [] a = {12,21,23,12,54,63,62,16,12,50,37};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number you want to check");
		int special = sc.nextInt();
		sc.close();
		int count=0;
		for(int i=0; i<a.length; i++ )
		{
			if(a[i] == special )
			{
				count++;
				
			}
			
		}

		System.out.println("appears in array "+count+" times");
		
	}

}

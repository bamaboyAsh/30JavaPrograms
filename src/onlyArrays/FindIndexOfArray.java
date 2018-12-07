package onlyArrays;

import java.util.Scanner;

public class FindIndexOfArray {

	public static void main(String[] args) 
	{
		int []a = {2,3,4,5,1,6,9,7};
		
		//find the index of an element in array

		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number in the array to check the index of it");
		int input=sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<a.length; i++)
		{
			if(input==a[i])
				System.out.println("Index of "+input+" is "+i);
		}

	}

}

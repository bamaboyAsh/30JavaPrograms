package onlyArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificElementFromAnArray 
{

	public static void main(String[] args) 
	{
		int [] array= {1,2,3,4,5,6,7,8,9};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an element you want to delete");
		int num= sc.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0; i<array.length;i++)
		{
			int convert = array[i];
			arrayList.add(convert);
		}
		System.out.println("");
		
		System.out.println(arrayList);
		
		for(int i=0; i<array.length; i++)
		{
			if(num==array[i])
			{
				arrayList.remove(i);
			}
			
		}
		System.out.println("");
		System.out.println(arrayList);
		
		
	}

}

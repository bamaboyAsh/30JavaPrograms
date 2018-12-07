package onlyArrays;

import java.util.Scanner;


public class Remove_A_SpecificElementFromArray {

	
	static int deleteElement(int a[], int size, int num1)
	{
		//if num1 is the last element do nothing just reduce the size of array by size-1
		if(a[size-1]==num1)
		{
			return (size-1);
		}
		
		//if not search the element in array from reverse direction
		int prev = a[size-1], i;
		for(i=size-2; i>=0 && a[i]!=num1; i--)

		{
			int curr= a[i];
			a[i]=prev;
			prev= curr;	
		}
		
		//if element is not found in the array
		if(i<0)
			return 0;
		//else if the element is found in array
		else
		{
			a[i]=prev;
			return (size -1);
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		int []a= {1,2,3,4,5,6,7,8,9};
		
		int size= a.length;
		
		//taking input from user to delete the array
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the element you want to delete");
		
		//save the input in num1
		int num1= sc.nextInt();
		
		sc.close();
		
		size= deleteElement(a, size, num1);
		
		System.out.println("New array after deleting "+num1+" is: ");
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+"");
		}
	}

}

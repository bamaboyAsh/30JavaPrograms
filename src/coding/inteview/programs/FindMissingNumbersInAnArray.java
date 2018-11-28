package coding.inteview.programs;

//You have given an integer array of size N. 
//Array contains numbers from 1 to N-1 but a couple of numbers 
//are missing in an array which also contains duplicates. 
//Write a Java program to print the missing number from the sequence


import java.util.Arrays;

public class FindMissingNumbersInAnArray {

	public static void main(String[] args) {
		
		//Given Input find the missing numbers
		int[] input ={1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		
		findDuplicates(input);
	}
	
	static void findDuplicates(int[] input)
	{
		//Given array is of N numbers and which is sorted 
		
		int length= input.length;
		
		System.out.println("The length of the given array is = "+length);
		
		
		int[] register= new int[input.length];
		
		
		for(int i: input)
		{
			register[i]=1;
		}
		
		System.out.println("Missing numbers in the given array");
		
		for(int i=1; i<register.length; i++)
		{
			if(register[i]==0)
				System.out.println(i);
		}
		for(int a: input)
		{
			System.out.print(a);
		}
		
		System.out.println("");
		
		System.out.println("");
		for(int b: register)
		{
		System.out.print(b);
		
		}
	}

}

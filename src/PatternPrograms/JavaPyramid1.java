package patternPrograms;
/*
Java Pyramid 1 Example
This Java Pyramid example shows how to generate pyramid or triangle
like given below using for loop.

 *
 **
 ***
 ****
 *****
 */

public class JavaPyramid1 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
				//Generating a new line 
				
			}
			System.out.println("");
		}
	}

}

// Output
//*
//**
//***
//****
//*****




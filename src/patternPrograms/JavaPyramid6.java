package patternPrograms;
/*
 	  $$
     $$$$
    $$$$$$
   $$$$$$$$ 
  $$$$$$$$$$
 $$$$$$$$$$$$
$$$$$$$$$$$$$$                
 */        

public class JavaPyramid6 {

	public static void main(String[] args) 
	{	
		
		//Here we have to create 2 triangle to solve this pyramid problem.
		
		//1st trangle with left side of dollars and white space
		// 2nd with right side of dollars and white space
		for(int i=1; i<=7; i++)
		{
			//first half of the triangle
			for(int j=7; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int d=1; d<=i;d++)
			{
				System.out.print("$");
			}
			//2nd half of triangle
			for(int a=1; a<=i; a++)
			{
				System.out.print("$");
			}
			System.out.println("");
		}
	}

}

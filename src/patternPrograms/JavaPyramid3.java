package patternPrograms;

/*
1 *****		
12 ****		
123 ***		
1234 **		
12345 *		
123456	
*/

public class JavaPyramid3 {

	public static void main(String[] args) 
	{
		
			for(int i=1; i<=6; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				
				for(int a=6; a>=i; a--)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			
			
	}
		

}



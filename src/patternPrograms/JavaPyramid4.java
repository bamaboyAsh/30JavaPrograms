package patternPrograms;
/*
12345 &	
1234 &&	
123 &&&	
12 &&&&	
1 &&&&&	
&&&&&&	
*/


public class JavaPyramid4 {

	public static void main(String[] args) 
	{
		
		for(int i=6; i>=1; i-- )
		{
			for(int j=1; j<i;j++)
			{
				System.out.print(j);
			}
			
			for(int a=6; a>=i; a--)
			{
				System.out.print("&");
			}
			System.out.println("");
		}
		
	}

}

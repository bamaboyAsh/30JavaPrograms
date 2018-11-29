package patternPrograms;

/*
@
@ @
@  @
@   @
@    @
@     @
@ @ @ @ @

*/

//for this program we have to print the first and 
//the last line manually and then we can combine @ and blank space in for loop

public class JavaPyramid5 {

	public static void main(String[] args) 
	{
		System.out.println("@");
		
		for(int i= 5; i>=1; i--)
		{
			System.out.print("@");
		
			for(int j=5; j>=i; j--)
				{
					System.out.print(" ");
				}
			System.out.print("@");
			System.out.println("");
		
		}
		System.out.println("@ @ @ @ @");
	}

}

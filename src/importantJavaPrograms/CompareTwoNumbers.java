package importantJavaPrograms;
/*
Compare Two Numbers Java Example
This Compare Two Numbers Java Example shows how to compare two numbers
using if else if statements.
*/

public class CompareTwoNumbers 
{

	public static void main(String[] args) 
	{
		//declare two numbers to compare
				int num1= 1234;
				int num2= 2312;
				
				if(num1>num2)
				{
					System.out.println(num1+" is greater than"+num2);
				}
				else if(num1<num2)
				{
					System.out.println(num2+" is greater than"+num1);
				}
				
				else
				{
					System.out.println(num1+" is equal to "+num2);
	
				}
	}

}

//Output 2312 is greater than1234


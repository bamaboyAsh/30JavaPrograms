package importantJavaPrograms;
/*
List Even & Odd Numbers Java Example
This List Even & Odd Numbers Java Example shows how to find and list even
and Odd numbers between 1 and any given number.
*/
public class ListEvenOdd {

	public static void main(String[] args) 
	{
		
		//Define Limit
		int limit = 50;
		
		System.out.println("printing even numbers between 1 and"+limit);
		for (int i=1; i<=limit; i++)
		{
			//if the number is divisible by 2 then it is even
			if(i%2==0)
			{
				System.out.println(i+" is a Even number");
			}
			else
				System.out.println(i+" is a Odd number");
		}

	}

}

/*Output
 * printing even numbers between 1 and50
1  Odd
2  Even
3  Odd
4  Even
5  Odd
6  Even
7  Odd
8  Even
9  Odd
10  Even
11  Odd
12  Even
13  Odd
14  Even
15  Odd
16  Even
17  Odd
18  Even
19  Odd
20  Even
21  Odd
22  Even
23  Odd
24  Even
25  Odd
26  Even
27  Odd
28  Even
29  Odd
30  Even
31  Odd
32  Even
33  Odd
34  Even
35  Odd
36  Even
37  Odd
38  Even
39  Odd
40  Even
41  Odd
42  Even
43  Odd
44  Even
45  Odd
46  Even
47  Odd
48  Even
49  Odd
50  Even
 */

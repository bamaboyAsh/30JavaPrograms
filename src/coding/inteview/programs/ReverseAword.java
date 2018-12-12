package coding.inteview.programs;

import java.util.Scanner;

public class ReverseAword {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a word to reverse");
		
		String word = in.nextLine();
		in.close();
		
		word =word.trim();
		
		String result="";
		
		char[] ch = word.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			result+=ch[i];
		}
		
		System.out.println(result);
	}

}

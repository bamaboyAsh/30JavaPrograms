package com.TimeAndDate;

import java.text.SimpleDateFormat;

public class TimeAndDateInSpecificFormat {

	public static void main(String[] args) 
	{
		//to print the date in specified format we have to create a obj of simpledateformat class
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss .SSS");
	
		System.out.println("\nNow: "+sdf.format(System.currentTimeMillis()));
		
		
	}
//Output: Now: 2018/12/12 03:51:37 .573
}

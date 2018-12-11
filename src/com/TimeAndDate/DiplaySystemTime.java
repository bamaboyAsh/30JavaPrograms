package com.TimeAndDate;

//Write a Java program to display the system time.
public class DiplaySystemTime {

	public static void main(String[] args) {
		//we can use System.currentTimeMillis() method to return current time but we also have to use 
		// system.out.format to print the time in human readable format.
		// %tc	Date and time formatted with “%ta %tb %td %tT %tZ %tY” e.g. “Wed Dec 12 03:33:46 IST 2018"
		System.out.println(System.currentTimeMillis());
		
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
		
		System.out.format("%tc", System.currentTimeMillis());
	}

}

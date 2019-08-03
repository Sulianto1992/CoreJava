package coreJavaAssignment; //Name of the package

import java.util.stream.IntStream; //Import stream from Java Library

public class Problem9 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
	    //Array declaration
		int [] number = {100, 67, 11, -87, 26};
		int numberToFind = 100;
		
		//Display the array and the element to be found 
		System.out.println("Array: 100, 67, 11, -87, 26");
		System.out.println("Number to find: 100");
		
		//Determine whether the number can be found in the array
		boolean found = IntStream.of(number).anyMatch(n -> n == numberToFind);
		
		//Output the message 
		if (found)
		{
			System.out.println("Output: Found");	
		}
		else
		{
			System.out.println("Output: Not Found");
		} //end if
		
	} //end main
} //end Problem9

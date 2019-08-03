package coreJavaAssignment;

import java.util.stream.IntStream;

public class Problem9 {

	public static void main(String[] args) 
	{
	    //Array declaration
		int [] number = {100, 67, 11, -87, 26};
		int numberToFind = 100;
		
		//Determine whether the number can be found in the array
		boolean found = IntStream.of(number).anyMatch(n -> n == numberToFind);
		
		//Output the message 
		if (found)
		{
			System.out.println("Found");	
		}
		else
		{
			System.out.println("Not Found");
		} //end if
	} //end main
} //end Problem9

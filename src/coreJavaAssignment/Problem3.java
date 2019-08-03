package coreJavaAssignment; //Name of the package

public class Problem3 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable declaration
		int numberOfRows = 4; 
		int alphabet = 65;
		
		//Execute this statement as long as it is true
		for (int a = 0; a <= numberOfRows; a++)
		{
			for (int b = 0; b <= a; b++)
			{
				System.out.print(((char) alphabet + " ")); //Display the alphabet in the alphabet pattern		
			}
			
			alphabet++; //Increment to the next alphabet
			System.out.println();
		} //end for loop
	} //end main
} //end Problem3



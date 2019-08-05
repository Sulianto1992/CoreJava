package assignment; //Name of the package

public class Problem2 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable declaration
		int numberOfRows = 5; 
		
		//Add space before the start of the number pattern
		System.out.println();
		
		//Execute this statement as long as it is true
		for (int a = 1; a <= numberOfRows; a++)
		{
			for (int b = 1; b <= a; b++)
			{
				System.out.print(b + " "); //Display number in the number pattern 			
			} //end for
			
			System.out.println(); //Move to the next line of the number pattern
		} //end for loop
	} //end main
} //end Problem2

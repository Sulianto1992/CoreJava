package coreJavaAssignment; //Name of the package

public class Problem4 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable declaration
		int numberOfRows = 4;
		
		//Execute this statement as long as it is true
		for (int i = numberOfRows;i >= 1; --i)
		{
			System.out.println(" ");
			
			for (int j = 1; j <= i; ++j)
			{
				System.out.print("* ");	//Display asterisk for the pattern			
			} //end for
			
			System.out.println(" "); //Move to the next line
		} //end for 

	} //end main
} //end Problem4


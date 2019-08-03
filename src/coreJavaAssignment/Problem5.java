package coreJavaAssignment; //Name of the package

public class Problem5 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable declaration
		int i, j;
		int numLine = 5;
		
		//Execute this statement as long as this is true
		for (i = 1;i <= 5; i++)
		{
			System.out.println(); //Move to the next line
			
			for (j = 1; j <= numLine; j++)
			{
				System.out.print(j + " ");	
			} //end for
			
			numLine--; //Decrement the number of elements for each line by 1
		} //end for loop

	} //end main
} //end Problem5

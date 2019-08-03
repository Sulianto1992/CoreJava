package coreJavaAssignment; //Name of the package

public class Problem8 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable Declaration
		int a, b;
		
		//Execute this statement as long as it is true
		for (a = 4; a >= 0; a--)
		{
			for (b = 0; b <= a; b++)
			{
				System.out.print("* ");
				
				if (b >= 2)
				{
					System.out.print("* ");
				} //end if
			} //end for
			
			System.out.println(); //Move to the next line
			
			if (b > 2)
			{
				System.out.println();
			} //end if
		} //end for 

	} //end main
} //end Problem8

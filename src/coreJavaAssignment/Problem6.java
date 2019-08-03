package coreJavaAssignment; //Name of the package

public class Problem6 //Name of the class
{
    public static void main(String[] args) //Start of the program
    {
    	//Execute this statement as long as it is true
    	for (int i = 0; i <= 4; i++)
		{
			System.out.println(" ");
			
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");	
				
				if (j >= 2)
				{
					System.out.print("* ");	
				} //end if 
				
			} //end for
			
			System.out.println(); //
		} //end for loop

	} //end main
} //end Problem6
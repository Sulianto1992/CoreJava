package assignment; //Name of the package

public class Problem1 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Execute this statement as long as it is true
		for (int i = 0;i < 4; i++)
		{
			System.out.println(" "); //Add blank space between stars for each line 
			
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");				
			} //end for
			
			System.out.println(" "); //Add blank space between each line of the number pattern
		} //end for loop

	} //end main
} //end Problem1

package coreJavaAssignment; //Name of the package

public class Problem7 //Name of the class 
{
	public static void main(String[] args) //Start of the program
	{
		//Variable Declaration
		int count = 1;
		int temp = 0;
		int temp2 = 0;
		
		//Add blank space between stars for each line 
		System.out.println(" "); 
		
		//Execute this statement as long as it is true
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				if ((j == 1) && (i == 1))
				{
					System.out.print(i + " ");
					count+=2;
				} 
				else if (j < i)
				{
					if (j == 1)
					{
						temp = i;
						System.out.print(temp + " ");
						temp2 = temp + 1;
					}
					else
					{
						System.out.print(temp2 + " ");
						temp2++;;
					} //end if
				} //end else if
				else if (j == i)
				{
					for (int l = count; l >= i; l--)
					{
						System.out.print(l + " ");
					} //end for
					
					count+=2;
					
				} //end if else
			
			} //end for
			System.out.println(); //Go to the next line 
			
		} //end for
	} //end main
} //end Problem 7

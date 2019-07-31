package coreJavaAssignment;

public class Problem6 
    {
    public static void main(String[] args) {
	
    	for (int i = 0; i <= 4; i++)
		{
			System.out.println(" ");
			
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");	
				if (j >= 2)
				{
					System.out.print("* ");	
				}
			}
			System.out.println(" ");
		} //end for loop

	} //end main

}
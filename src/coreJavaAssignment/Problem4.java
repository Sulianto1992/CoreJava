package coreJavaAssignment;

public class Problem4 {

	public static void main(String[] args) {
		
		//Contains 4 rows as the array begins with index 0
		int numberOfRows = 4;
		
		for (int i = numberOfRows;i >= 1; --i)
		{
			System.out.println(" ");
			
			for (int j = 1; j <= i; ++j)
			{
				System.out.print("* ");				
			}
			System.out.println(" ");
		} //end for loop

	} //end main

 } //end Problem45


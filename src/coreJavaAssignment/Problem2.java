package coreJavaAssignment; //Name of the package

public class Problem2 {

	public static void main(String[] args) {
		
		
		int numberOfRows = 5; 
		
		for (int a = 1; a <= numberOfRows; a++)
		{
			for (int b = 1; b <= a; b++)
			{
				System.out.print(b + " ");				
			}
			System.out.println();
		} //end for loop
	} //end main

} //end Problem2

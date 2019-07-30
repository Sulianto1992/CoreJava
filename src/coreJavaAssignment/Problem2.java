package coreJavaAssignment; //Name of the package

public class Problem2 {

	public static void main(String[] args) {
		
		//The number of row is 4 as the array starts from index 0
		int numberOfRows = 4; 
		
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

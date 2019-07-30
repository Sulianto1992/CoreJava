package coreJavaAssignment;

public class Problem5 {

	public static void main(String[] args) {
		
		//The number of row is 4 as the array starts from index 0
		int numberOfRows = 5; 
		
		for (int a = numberOfRows; a >= 1; --a)
		{
			for (int b = 1; b <= a; ++b)
			{
				System.out.print(b + " ");				
			}
			System.out.println();
		} //end for loop
	} //end main

	}

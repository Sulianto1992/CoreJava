package coreJavaAssignment;

public class Problem3 {

	public static void main(String[] args) {
		
		//The number of row is 4 as the array starts from index 0
		int numberOfRows = 4; 
		int alphabet = 65;
		
		for (int a = 0; a <= numberOfRows; a++)
		{
			for (int b = 0; b <= a; b++)
			{
				System.out.print(((char) alphabet + " "));				
			}
			alphabet++;
			System.out.println();
		} //end for loop
	} //end main
}



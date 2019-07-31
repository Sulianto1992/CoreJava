package coreJavaAssignment;

public class Problem8 {

	public static void main(String[] args) {
		
		//Variable Declaration
		int a, b;
		
		for (a = 4; a >= 0; a--)
		{
			for (b = 0; b <= a; b++)
			{
				System.out.print("* ");
				
				if (b >= 2)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
			
			if (b > 2)
			{
				System.out.println();
			} //end if
		} //end for 

	} //end main

} //end Problem8

package coreJavaAssignment;

public class Problem7 {

	public static void main(String[] args) {
		
		int numberOfRows = 5;
		
		
		for (int i = 1; i <= numberOfRows; i++)
		{
			for (int j = i; j <= numberOfRows; j++)
			{
				System.out.print(j + " ");
				
				if (i == 1)
				{
					break;
				}
			}
			
			/*
			for (int k = numberOfRows - 1 ; k >= i; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
			*/
			System.out.println();
		}

	}

}

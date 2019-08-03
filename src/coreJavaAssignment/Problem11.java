package coreJavaAssignment; //Name of the package

public class Problem11 //Name of the class
{
	public static void main(String[] args) //Start of the program
	{
		//Variable Declaration
		int [] arr = {22, 33, 11, 22, 15, 26, 32, 41};
		int length = arr.length; //Length of the array
		int temp;
		int l = 0;
		
		System.out.println("Before removing duplicates: \n22 33 11 22 15 26 32 41\n");
		System.out.println("After removing duplicates:");
		
	    //Sort the array in ascending order
		for (int i = 0; i < length; i++)
		{
			for (int j = i + 1; j < length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} //end if 
			} //end for
		} //end for
		
		//Execute this statement as long as it is true
		for (int k = 0; k < length - 1; k++)
		{
			if (arr[k] != arr[k + 1])
			{
				arr[l++] = arr[k];
			} //end if 
		} //end for
		
		arr[l++] = arr[length - 1];
		
		//Display the elements after removing the duplicates
		for (int m = 0; m < l; m++) 
		{
			System.out.print(arr[m] + " ");
		} //end for

	} //end main
} //end Problem11

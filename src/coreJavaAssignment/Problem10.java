package coreJavaAssignment; //Name of the package

public class Problem10 
{
	
	public static void main(String[] args) 
	{
		
		//Initialize array variables
		int[] array1 = {1, 2, 5, 8, 9, 11};
		int[] array2 = {5, 8, 11, 12, 21, 27};
		int[] array3 = {5, 8, 11, 19, 23, 30, 34};
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		//Display the elements of each array created
		System.out.println("Array 1: 1, 2, 5, 8, 9, 11");
		System.out.println("Array 2: 5, 8, 11, 12 ,21, 27");
		System.out.println("Array 3: 5, 8, 11, 19, 23, 30, 34");
		System.out.println("\nThese are the common elements found in these 3 arrays:");
		
		//Executes the loop as long as it is true
		while (true)
		{
			//Terminates the loop if either array has its index out of range
			if ((index1 >= array1.length) || (index2 >= array2.length) || (index3 >= array3.length)) 
			{
				break;
			}//end if
			
            //Execute the statements based on the conditions met
			if ((array1[index1] == array2[index2]) && (array1[index1] == array3[index3]))
			{
				//Output the value if all array have the same array element
				System.out.print(array1[index1]);
				System.out.print(" ");
				index1 += 1; //Increment index of the first array by 1
				index2 += 1; //Increment index of the second array by 1
				index3 += 1; //Increment index of the third array by 1
			}
			else if (array1[index1] < array2[index2]) 
			{
				index1 += 1; //Increment index of the first array by 1
			}
			else if (array2[index2] < array3[index3])
			{
				index2 += 1; //Increment index of the second array by 1
		    }
			else
			{
				index3 += 1; //Increment index of the third array by 1
			} //end if else
	     } //end while
	 } //end main
} //end Problem 10

	

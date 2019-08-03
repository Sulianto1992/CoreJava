package coreJavaAssignment; //Name of the package

public class Problem13 
{
	public static void main(String[] args) 
	{
		
		//Array declaration
		int[] arr = {20, 20, 30, 40, 50, 50, 50};
	    int arrayLength = arr.length;
	    
	    //For loop
	    for (int a = 0; a < arrayLength; a++)
	    {
	    	for (int b = a + 1; b < arrayLength; b++)
	    	{
	    		if (arr[a] == arr[b])
	    		{
	    			arr[b] = arr[arrayLength - 1];
	    			arrayLength--;
	    			b--;
	    		} //end if
	    	} //end for
	    } //end for 
	    
	    //Display the length of the array
	    System.out.println("The length of the array is " + arrayLength);
	    
	} //end main
} //end Problem13

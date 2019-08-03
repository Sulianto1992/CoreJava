package coreJavaAssignment; //Name of the package

public class Problem12 //Name of the class
{
	public static void main(String[] args) //Start of the program 
	{
		
       //Array initialization
	   int array[] = {1, 4, 5, 7, 9};
	   int largest = array[0];
	   int secondLargest = array[0];
	   int smallest = array[0];
	   int secondSmallest = array[0];
	   
	   //Execute this statement as long as it is true
	   for (int i = 0; i < array.length; i++)
	   {
		   if (array[i] > largest) 
		   {
			   secondLargest = largest;
			   largest = array[i];
		   }
		   else if (array[i] > secondLargest)
		   {
			   secondLargest = array[i];
		   } //end if 
		   
       } //end for 
	   
	   //Execute this statement as long as it is true
	   for (int j = 0; j < array.length; j++)
	   {
		   if (array[j] < smallest)
		   {
			   secondSmallest = smallest;
			   smallest = array[j];
		   }
		   else if ((array[j] < secondSmallest && (array[j] != smallest)) || (smallest == secondSmallest))
		   {
			   secondSmallest = array[j];
		   } //end if
		   
      } //end for
	   
	   //Display second largest and second smallest element in the array
	   System.out.println("The second largest number is " + secondLargest);
	   System.out.println("The second smallest number is " + secondSmallest);
		
	} //end main

} //end Problem2

package coreJavaAssignment;

public class Problem12 {

	public static void main(String[] args) {
		
       //Array initialization
	   int array[] = {1, 4, 5, 7, 9};
	   int largest = array[0];
	   int secondLargest = array[0];
	   int smallest = array[0];
	   int secondSmallest = array[0];
	   
	   //For loop to determine largest and second largest element
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
		   }
       } //end for loop
	   
	   //for loop to determine smallest and second smallest element
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
		   }   
      } //end for loop
	   
	   //Display second largest and second smallest element in the array
	   System.out.println("The second largest number is " + secondLargest);
	   System.out.println("The second smallest number is " + secondSmallest);
		
	} //end main

} //end class

package coreJavaAssignment;

public class Problem10 {
	
	
	public static void main(String[] args) {
		
		//Initialize array variables
		int[] array1 = {1, 2, 5, 8, 9, 11};
		int[] array2 = {5, 8, 11, 12, 21, 27};
		int[] array3 = {5, 8, 12, 19, 23, 30, 34};
		int index1 = 0;
		int index2 = 0;
		
		while (true)
		{
			if ((index1 >= array1.length) || (index2 >= array2.length)) 
			{
				break;
			}
			if (array1[index1] == array2[index2])
			{
				System.out.println(array1[index1]);
				System.out.println(" ");
				index1 += 1;
			}
			else if (array1[index1] < array2[index2]) 
			{
				index1 += 1;
			}
			else
			{
				index2 += 1;
		}
	  }
	}
}

	

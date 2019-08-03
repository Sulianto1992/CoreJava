package coreJavaAssignment;

public class Problem10 {
	
	/*
	private static void checkCommonElements(int[] firstArray, int[] secondArray, int[] thirdArray) {
		
		int firstArrayLength = firstArray.length;
		int secondArrayLength = firstArray.length;
		int thirdArrayLength = firstArray.length;
		
		int firstArrayCount = 0; 
		int secondArrayCount = 0; 
		int thirdArrayCount = 0; 
		
		while ( (firstArrayCount < firstArrayLength) && (secondArrayCount < secondArrayLength) && 
				(thirdArrayCount < thirdArrayLength))
		{
			
		}
	}
	*/
	
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
		
		//checkCommonElements(array1, array2, array3);
	}

	

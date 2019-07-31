package coreJavaAssignment;

public class Problem10 {
	
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
	
	public static void main(String[] args) {
		
		//Initialize array variables
		int[] array1 = {1, 2, 5, 8, 9, 11};
		int[] array2 = {5, 8, 11, 12, 21, 27};
		int[] array3 = {5, 8, 12, 19, 23, 30, 34};
		
		checkCommonElements(array1, array2, array3);
	}

	

}

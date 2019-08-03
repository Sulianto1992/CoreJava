package coreJavaAssignment;

public class Problem11 {


	public static void main(String[] args) {
		
		
		//Variable Declaration
		int [] arr = {22, 33, 11, 22, 15, 26, 32, 41};
		int length = arr.length; //Length of the array
		int temp;
		int l = 0;
		
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
				}
			}
		}
		
		for (int k = 0; k < length - 1; k++)
		{
			if (arr[k] != arr[k + 1])
			{
				arr[l++] = arr[k];
			}
		}
		
		arr[l++] = arr[length - 1];
		
		for (int m = 0; m < l; m++) 
		{
			System.out.print(arr[m] + " ");
		}

	}

	

}

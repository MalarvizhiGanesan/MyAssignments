package week2.day1Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input guide given by Dilip
				int[] data = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
				
				//Array Size
				int size = data.length;
				
				// Sort the array	
				Arrays.sort(data);
				

				// loop through the array (start i from arr[0] till the length of the array)
				for (int i = 0; i < size; i++) 
				{
				
					int j=i+1;
					// check if the iterator variable is not equal to the array values respectively
					if(j!=data[i]) 
					{
						
						System.out.println(j);
						break;
					}
				}

	}

}

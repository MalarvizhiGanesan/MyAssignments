package week2.day1Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};
			
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				int totalsizeofthearray=data.length;
				Arrays.sort(data);

				System.out.println("Second Largest is " + data[totalsizeofthearray-2]);
	}

}

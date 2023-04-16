package week3.day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		List<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
	
		
		 //Pseudo Code:
		 //1) Arrange the array in ascending order
		 		Collections.sort(array);
		 		
		 //2) Pick the 2nd element from the last and print it

		 		int size = array.size();
				
		System.out.println("Second Largest no.: "+array.get(size-2));

	}

}

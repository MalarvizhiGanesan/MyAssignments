package week3.day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(7);
		array.add(6);
		array.add(8);
		int size = array.size();

		// Sort the array	
		
		Collections.sort(array);

		// loop through the array (start i from arr[0] till the length of the array)


		// check if the iterator variable is not equal to the array values respectively
			
		// print the number
				
		// once printed break the iteration
		
		for (int n = 0; n < size; n++) {
			int i=n+1;
			
			if (i!=array.get(n)) {
				
				System.out.println("Missing no is "+i);
				break;
			}
		}
	



	}

}

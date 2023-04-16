package week3.day2Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///*
		//* Pseudo Code
		
		 //* a) Declare An array for {3,2,11,4,6,7};
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		
		System.out.println("Elements in List1: "+array1);
		
		//Size of list1 and list2
		int array1size = array1.size();


		
		// * b) Declare another array for {1,2,8,4,9,7};
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		
		System.out.println("Elements in List2: "+array2);
		
		int array2size = array2.size();
		

				
		 //* c) Declare for loop iterator from 0 to array length
		System.out.println("Intersction between two list is: ");
		for (int i = 0; i < array1size; i++) 
		{
		
		// * d) Declare a nested for another array from 0 to array length
		
			for (int j = 0; j < array2size; j++) 
			{
		 //* e) Compare Both the arrays using a condition statement
				
				if (array1.get(i)==array2.get(j)) {
		 
		// *  f) Print the first array (should match item in both arrays)
		 
					System.out.println(array1.get(j));
				}
			}
			
		}

		


	}

}

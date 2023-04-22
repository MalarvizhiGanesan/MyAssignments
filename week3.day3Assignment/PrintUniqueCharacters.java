package week3.day3Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		
		/* * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 */ 
		 
	
		
		String name ="babu";
		
		char[] ch = name.toCharArray();
		Set<Character> uniquechar = new LinkedHashSet<Character>();
				
		for (Character c : ch) {
			
			boolean add = uniquechar.add(c);
			
			if(!add)
			{
				uniquechar.remove(c);
			}
		}
		
		System.out.println(uniquechar);
		
	}

}

package week3.day3Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharactersUseSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "google";
		String print="";
		
		//conver to char array
		char[] ch = Name.toCharArray();
		System.out.println("The given string is:" );
		System.out.println(ch);
		
		Set<Character> uniquechar = new LinkedHashSet<Character>();
		Set<Character> duplicatechar= new LinkedHashSet<Character>();
		
 		for (Character c : ch) {
			boolean add = uniquechar.add(c);
			if(!add)
			{
				duplicatechar.add(c);
			}
					
		}
 		
 		//Convert Set to List to convert character set to String
 		List<Character> list = new ArrayList<Character>(uniquechar);
 		
 		for (Character unichar : list) {
 			print=print+unichar;
		}
 		
		System.out.println("Unique characters in set:");
		System.out.println(uniquechar);
		System.out.println("Dulicate characters in set:");
		System.out.println(duplicatechar);
		System.out.println("Unique Characters in list is :"+print);
	}


}

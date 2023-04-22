package week3.day3Assignment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateStringUseSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* a) Use the declared String text as input
		//String text = "We learn java basics as part of java sessions in java week1";	
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
	
		String text = "We learn java basics as part of java sessions in java week1";
		String expoutput= "";
		String[] split = text.split(" ");
		Set <String> str = new LinkedHashSet <String>();
		for (String i : split) {
			str.add(i);
		}
	List <String> list = new ArrayList<String>(str);
		for (String str1 : list) {
		expoutput= expoutput+" "+str1;
		}
		System.out.println(expoutput);
					
		
 		
 	
	}
}




	



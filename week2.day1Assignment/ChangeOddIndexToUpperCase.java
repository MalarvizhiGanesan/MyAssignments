package week2.day1Assignment;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//guide to write code
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test="changeme";
		char[] charArray = test.toCharArray();
			for (int i = 0; i < charArray.length; i++) 
			{
			
			//find the odd index within the loop (use mod operator)
				if (i%2==1) 
					{ 
				
						char upperCase = Character.toUpperCase(charArray[i]);
				
							System.out.println("UpperCase of "+charArray[i]+" is: "+upperCase);
					}
			}
				
		

	}

}

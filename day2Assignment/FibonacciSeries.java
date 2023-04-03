package week1.day2Assignment;

public class FibonacciSeries 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int range=7,a=0,b=1;
		 System.out.println(a);
		 System.out.println(b);
		 for(int i=1;i<range;i++) 
		 {
			 int sum=a+b;
			 System.out.println(sum);
			  a=b;
			 b=sum;
			 					
		}
		
	}

}

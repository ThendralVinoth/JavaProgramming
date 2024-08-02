package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
	
		//Example1: print 1.....10 numbers
		
	/*	for(int i=1;i<=10;i++)
		{
		   System.out.println(i);	
		}
    */
		
		//Example2: print 1.....10 even numbers
		
	/*	for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
		}
	*/
		
		//Example3: print 1.....10 numbers
		/* 1  odd
		   2  even
		   3  odd
		   4  even
		   ....
		   10  even
		 */
		
	/*	for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even number");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
		}
	*/
		
		//Example4: print 10.....1 numbers
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		
	}

}

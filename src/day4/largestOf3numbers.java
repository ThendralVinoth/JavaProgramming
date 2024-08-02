package day4;

/*
 a>b and a>c ----a is largest number
 b>a and b>c ----b is largest number
 c>a and c>b ----c is largest number
 */

public class largestOf3numbers {

	public static void main(String[] args) {
		
		int a=100,b=200,c=30;
	/*	
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number "+b);
		}
		else
		{
			System.out.println("c is largest number "+c);
		}
	*/	
		
		//Ternary operator
		
		// int largest1=a>b ? a:b; // largest of a & b
		// int largest2=c>largest1 ? c:largest1; // largest of c & largest1
		
		int largest=c>(a>b?a:b) ? c:(a>b?a:b);
		System.out.println(largest+":largest number");
       
	}

}

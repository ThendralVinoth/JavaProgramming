package day4;

public class AssignmentLargestOf2Numbers {

	public static void main(String[] args) {
	
		//Largest of 2 numbers - if else condition
		
		/* int a=20, b=30;
		
		if(a>=b)
		{
			System.out.println("a is largest number:"+a);
		}
		else
		{
			System.out.println("b is largest number:"+b);
		} */
		
		//Largest of 2 numbers - Ternary operator
		
		int a=30, b=20;
		
		int x=(a>b)? a:b;
		System.out.println(x);
		
		

	}

}

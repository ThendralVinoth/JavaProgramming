package day2;

public class VariableDemo
{

	public static void main(String[] args) 
	{
		//int a;     //declaration
	    //a=100;     //assignment
	    
		/*
		int a=100;   //declaration+assignment
		System.out.println(a);
		a=200;
		System.out.println(a);
      */
		
		//approach 1 - if all the variables are belongs to different data types
		/* int a=100;
		   int b=200;
		   int c=300;
		*/
		//approach 2 - if all the variables are belongs to same data types
		 /*  int a,b,c;
		   a=100;
		   b=200;
		   c=300;
		 */
		//approach 3 - if all the variables are belongs to same data types
		   int a=100,b=200,c=300;
		   System.out.println("the value of a is:"+a);
		   System.out.println("the value of b is:"+b);
		   System.out.println("the value of c is:"+c);
		   
		   System.out.println(a+" "+b+" "+c); // 100 200 300
		   
	}

}

package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("program is started..");
		
		Scanner sc=new Scanner(System.in);
		
		//Example1: ArithmeticException
		
	/*	System.out.println("Enter a number");
		int num=sc.nextInt();
		
		System.out.println(100/num); // ArithmeticException
	*/	
		//Example2:ArrayIndexOutOfBoundException
		
	/*	int a[]=new int[5];
		
		System.out.println("enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value; // ArrayIndexOutOfBoundException
		
		System.out.println(a[pos]);
	*/	
		
		//Example3:NumberFormatException
		
	/*	String s="welcome";
		
		int num=Integer.parseInt(s); // NumberFormatException 
		
		System.out.println(num);
	*/	
		
		//Example4:NullPointerException
		
		String s=null;
				
		System.out.println(s.length()); //NullPointerException
		
		System.out.println("program is completed..");
		System.out.println("program is exited..");
    
		
		
				
	}

}

package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("program started...");
		System.out.println("program in progres...");
		
		Thread.sleep(5000); // InterruptedException
		
	    FileInputStream file=new FileInputStream("c:\\Txt.txt"); // FileNotFoundException
		
		
		
	/*	try
		{
		Thread.sleep(5000); // InterruptedException
		}
		
		catch(InterruptedException e)
		{
			
		}
	*/	
		
		System.out.println("program finished...");
		System.out.println("program exited...");
		
		
		

	}

}

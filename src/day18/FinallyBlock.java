package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		
		// Case1: Exception occured , catch block handled ---> finally block will execute
		
     /*   String s=null;
		
		try
		{
		System.out.println(s.length()); // NullPointerException
		}
		
		catch(NullPointerException e)
		{
			System.out.println(" Catch block Handled Exception.. ");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("you entered into finally block.. ");
			
		}
		
		System.out.println("program finished..");
	*/
		
		// Case2: Exception occured , catch block NOT handled ---> finally block will execute
		
   /*   String s=null;
		
		try
		{
		System.out.println(s.length()); // NullPointerException
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(" Catch block Handled Exception.. ");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("you entered into finally block.. ");
			
		}
	*/
		
		// Case3: Exception does not occured , catch block ignored ---> finally block will execute
		
        String s="welcome";
		
		try
		{
		System.out.println(s.length()); // NullPointerException
		}
		
		catch(NullPointerException e)
		{
			System.out.println(" Catch block Handled Exception.. ");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("you entered into finally block.. ");
			
		}

	}

}

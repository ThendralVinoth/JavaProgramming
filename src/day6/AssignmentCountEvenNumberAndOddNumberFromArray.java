package day6;

public class AssignmentCountEvenNumberAndOddNumberFromArray {

	public static void main(String[] args) {
		
		// Normal for loop
	/*
		int a[]= {1,2,3,4,5,6};
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<6;i++)
		{
			if(a[i]%2==0)
			{
				even_count++;
				System.out.println(a[i]);
			}
			
		}
		
		System.out.println("Number of even number:"+even_count);
			
		for(int i=0;i<6;i++)
			{
				if(a[i]%2!=0)
				{
				odd_count++;
			    System.out.println(a[i]);
				}
			}
		System.out.println("Number of odd number:"+odd_count);
	*/	
		
		//Enhanced for loop
		int a[]= {1,2,3,4,5,6};
		int even_count=0;
		int odd_count=0;
		
		for(int x:a)
		{
			
			if(x%2==0)
			{
				even_count++;
				System.out.println(x);
			}
			
		}
		
		System.out.println("Number of even number:"+even_count);
		
		
		for(int x:a)
		{
			
			if(x%2!=0)
			{
				odd_count++;
				System.out.println(x);
			}
			
		}
	    
        System.out.println("Number of odd number:"+odd_count);	
		  
	}

}

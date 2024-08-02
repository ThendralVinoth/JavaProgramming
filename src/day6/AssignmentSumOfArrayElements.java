package day6;

public class AssignmentSumOfArrayElements {

	public static void main(String[] args) {
		
		//Normal for loop
	/*	
		int a[]= {1,2,3,4,5}; 
		int sum=0;
		 
		for(int i=0;i<5;i++)
		{
			 sum =sum + a[i];
		}
		 System.out.println("Sum of Array elements:"+sum);
     */ 
		
		//Enhanced for loop
		
		int a[]= {1,2,3,4,5}; 
		int sum=0;

		 
		for(int x:a)
		{
			 sum =sum + x;
		}
		 System.out.println("Sum of Array elements:"+sum);
		
	}
	

}

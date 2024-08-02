package day7;

public class AssignmentMissingNumberinArray {
	
	//Array should not have duplicates
	//Array No need to be sorted order
	//values should be in range

	public static void main(String[] args) {
		
		int a[]= {1,4,5,3};
		
		//1+4+5+3=13 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15-13=3 missing
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		System.out.println("Sum of elements in Array:"+sum1);
		
        int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		
		System.out.println("Sum of range of elements in Array:"+sum2);
		
		int missing_number=sum2-sum1;
		
		System.out.println("Missing number is:"+missing_number);


	}

}

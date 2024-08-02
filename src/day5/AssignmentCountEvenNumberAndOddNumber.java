package day5;

public class AssignmentCountEvenNumberAndOddNumber {

	public static void main(String[] args) {
		int num=23456;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num=num/10;
		}
		
		System.out.println("Number of Even numbers:"+even_count);
		System.out.println("Number of odd numbers:"+odd_count);
	}

}

package day5;

public class AssignmentCountNumberOfDigits {

	public static void main(String[] args) {
		int num=423424, count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("number of digits:"+count);
		
	}

}

package day4;

public class AssignmentSmallestOf3numbers {

	public static void main(String[] args) {
	
		int a=10, b=20, c=30;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest number");
		}

	}

}

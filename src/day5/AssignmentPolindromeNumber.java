package day5;

public class AssignmentPolindromeNumber {

	public static void main(String[] args) {
		int num=121, rev=0, temp=num;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is Polindrome number");
		}
		else
		{
			System.out.println(temp+" is Not Polindrome number");
		}

	}

}

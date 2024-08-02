package day9;

public class AssignmentPolindromeStringOrNot {
	public static void main(String[] args) {
		
		String s="MADAM";
		String rev="";
		String temp=s;
		
	/*	char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			// System.out.println(a[i]);
			rev=rev+a[i];
	*/	
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
	
		}
			
			
		if(rev.equals(temp))
		{
			System.out.println(rev+" is Polindrome String");
		}
		else
		{
			System.out.println(rev+" is Not Polindrome String");
		}
		
		
		
	}

}

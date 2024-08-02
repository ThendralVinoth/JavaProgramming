package day9;

import java.util.Scanner;

public class AssignmentStringIsPolndromeOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String org_str=sc.next();
		String str=org_str;
		String rev="";
		
		
		for(int i=org_str.length()-1;i>=0;i--)
		{
			rev=rev+org_str.charAt(i);
		}
		
		if(rev.equals(str))
		{
			System.out.println(rev+" is Polindrome String");
		}
		else
		{
			System.out.println(rev+" is Not Polindrome String");
		}
		

	}

}

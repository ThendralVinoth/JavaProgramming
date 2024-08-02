package day9;

public class ReverseString {

	public static void main(String[] args) {
		
		//Approach1 - length() , charAt()
		
	/*	String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
	
		}
		
		System.out.println("Reverse String is:"+rev);
		
	*/	
		
		//Approach2 - by converting string to char array type
		              //without using string method length() , charAt()
		
	/*	String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			//System.out.println(a[i]);
			rev=rev+a[i];
		}
		
		System.out.println("Reverse String is:"+rev);
     */
		
		
		//Approach3 - using StringBuffer class and using reverse() method  
		
		StringBuffer s=new StringBuffer("welcome");
		
		System.out.println("Reverse String:"+s.reverse());
		
		//Approach4 - using StringBuilder class and using reverse() method
		
		StringBuilder s1=new StringBuilder("welcome");
				
		System.out.println("Reverse String:"+s1.reverse());
	}

}

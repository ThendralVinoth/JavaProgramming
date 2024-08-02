package day19;

// A b=(C) d;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
		//Ex1:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; // rule1=yes  rule2=yes  rule3=failed
		
		//Ex2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //rule1=failed
		
		//Ex3:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; // rule1=yes  rule2=yes  rule3=failed
		
		//Ex4:
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o; // rule1=yes rule2=failed
		
		//Ex5:
		//String s=new String("welcome");
		//StringBuffer sb=(String) s; // rule1=yes rule2=failed
		
		//Ex6:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;  // rule1=yes  rule2=yes  rule3=failed
		
		//Ex7:
		Object o=new String("welcome");
		String s=(String) o; // rule1=yes  rule2=yes  rule3=yes
		
		System.out.println(s);
		

	}

}

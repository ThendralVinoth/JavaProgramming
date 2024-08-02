package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[]={100,10.5,'A',"WELCOME",true};
		
		//Enhanced for loop
		
	/*	for(Object x:a)
		{
			System.out.print(x+" ");
		}
	    System.out.println();
	*/
		
	    // Normal for loop
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	    System.out.println();
	
    
	}

}

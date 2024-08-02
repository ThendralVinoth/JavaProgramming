package day7;

public class SearchingElementArray {

	public static void main(String[] args) {
		//Linear Search Elements
		//Normal for loop
		
	/*	int a[]= {10,20,30,40,50};
		int search_element=30;
		
		boolean status=false; // false - Element not found, true - Element found 
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		 
		}
		if(status==false) 
		{
		System.out.println("Element not found");
		}
	*/	
		
		//Enhanced for loop
		
		int a[]= {10,20,30,40,50};
		int search_element=30;
		
		boolean status=false; // false - Element not found, true - Element found 
		
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		 
		}
		if(status==false) 
		{
		System.out.println("Element not found");
		}
		
	}

}

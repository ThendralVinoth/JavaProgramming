package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration --> Heterogenious data --stored
		
		ArrayList mylist=new ArrayList();
		
		//List mylist1=new ArrayList();
			
		
		//Declaration --> Homogeni0us data --stored
		
	/*	ArrayList<Integer> mylist=new ArrayList<Integer>();
		
		ArrayList<String> mylist1=new ArrayList<String>();
		
	*/	
		
		//Adding data into arraylist
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arraylist
		
		System.out.println("Size of an arraylist:"+mylist.size()); //8
		
		//Printing arraylist
		
		System.out.println("Printng data from arraylist:"+mylist); //[100, 10.5, welcome, A, true, 100, null, null]
				
		//Remove element from arraylist
		
		mylist.remove(5); // here 5 is index of element
		
		System.out.println("After Removing:"+mylist); //[100, 10.5, welcome, A, true, null, null]

	    //Insert element in the arraylist
		
		mylist.add(2,"java"); // here 2 is index of element
		
		System.out.println("After Inseration:"+mylist); //[100, 10.5, java, welcome, A, true, null, null]
	
	    //Modify element in the arraylist(replace/modify/change)
		
        mylist.set(2,"python"); // here 2 is index of element
		
		System.out.println("After replacing:"+mylist); //[100, 10.5, python, welcome, A, true, null, null]
		
		//Access specific element from arraylist
		
		System.out.println(mylist.get(3)); //here 3 is index //welcome
		
		//Reading all the elements from arraylist
		
		//using normal for loop
		
	/*	for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
	*/
		
		
		
		// using for...each loop or enhanced for loop
		
	/*	for(Object x:mylist)
		{
			System.out.println(x);
		}
	
	*/
		
		//using iterator
		
		Iterator<Object> it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Cheking arraylist is empty or not
		
		System.out.println("Is Arraylist empty?:"+mylist.isEmpty()); //false
		
		//remove all the elements from arraylist
		
		ArrayList mylist2=new ArrayList();
		
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements:"+mylist); //[10.5, python, A, true, null, null]
		
		//remove all the elements / clear
		
		mylist.clear();
		
		System.out.println("Is Arraylist empty?:"+mylist.isEmpty()); //true
		
		
	
		
		
		
		
		
	}
	

}

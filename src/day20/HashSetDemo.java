package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration --> Heterogenious data --stored
		
		HashSet myset=new HashSet();
		
		//Set myset1=new HashSet();
		
		//Declaration --> Homogeni0us data --stored
		
	/*	HashSet<Integer> myset=new HashSet<Integer>();
		
		HashSet<String> myset1=new HashSet<String>();
		
	*/
		
		//Adding elements into hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing hashset
		
		System.out.println(myset); //[null, A, 100, 10.5, welcome, true]
		
		//Size of HashSet
		
		System.out.println("Size of Hashset:"+myset.size()); //6
		
		//Removing element
		
		myset.remove(10.5); // 10.5 is value (not an index)
		
		System.out.println("After removing:"+myset); //[null, A, 100, welcome, true]
		
		//Inserting element - Not possible
		
		//Access specific element - Not possible
		
		//Convert HashSet ---> ArrayList
		
		ArrayList al=new ArrayList(myset);
		
		System.out.println(al);
		
		System.out.println(al.get(2)); //100
		
		//Read all the elements for...each / Enhanced for loop
		
	/*	for(Object x:myset)
		{
			System.out.println(x);
		}
	*/
		
		//Using iterator
		
		Iterator<Object> it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//remove all the elements from Hashset
		
        HashSet myset2=new HashSet();
		
		myset2.add(100);
		myset2.add("welcome");
		
		myset.removeAll(myset2);
		
        System.out.println("After removing multiple elements:"+myset); //[null, A, true]
		
		//remove all the elements / clear
		
		myset.clear();
		
		System.out.println("Is HashSet empty?:"+myset.isEmpty()); //true
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}

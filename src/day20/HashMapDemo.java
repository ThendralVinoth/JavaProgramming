package day20;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration --> Heterogenious data --stored
		
		//HashMap hm=new HashMap();
		
		//Map m=new HashMap();
		
		//Declaration --> Homogeni0us data --stored
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Marry");
		hm.put(104,"Scott");
		hm.put(102,"David");
		
		System.out.println(hm); //{101=John, 102=David, 103=Marry, 104=Scott}
		
		//Size of HashMap
		
		System.out.println("Size of HashMap:"+hm.size()); //4
		
		//Removing pair
		
		hm.remove(103); // 103 is key of the pair
				
		System.out.println("After removing pair:"+hm); //{101=John, 102=David, 104=Scott}
		
		//access value of the key
		
		System.out.println(hm.get(102)); //David
		
		//get all the keys from hashmap
		
		System.out.println(hm.keySet()); //[101, 102, 104]
		
		//get all the values from hashmap
		
		System.out.println(hm.values()); //[John, David, Scott]
		
		//get all the keys and values from hashmap
		
		System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott]
		
		//Using for..each / Enhanced for loop
		
	/*	for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
	*/	
		
		// enhanced for loop get keys only
		
		Set<Entry<Integer, String>> c=hm.entrySet();
				
		for(Entry<Integer,String> entry:c)
		{
			System.out.println(entry.getKey());
		}
				
		// enhanced for loop get keys only
				
		Set<Entry<Integer, String>> d=hm.entrySet();
				
		for(Entry<Integer,String> entry:d)
		{
			System.out.println(entry.getValue());
		}
		//Using iterator
		
	/*	Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	*/
		//remove all the elements / clear
		
		hm.clear();
				
		System.out.println("Is HashMap empty?:"+hm.isEmpty()); //true
		
		
				
	
		
		

	}

}

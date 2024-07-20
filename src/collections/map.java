package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class map 
{
	//Key-Value Pairs: Stores data in key-value pairs.
	//No Duplicate Keys: Does not allow duplicate keys; new value replaces the old one for the same key.
	//Allows Null: Permits one null key and multiple null values.
	//Unordered: Does not maintain insertion order.
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<>();
//put(K key, V value): Associates the specified value with the specified key in this map.
		hm.put(1195, "kamesh");
		hm.put(1992, "rajesh");
		hm.put(1194, "aditya");
		hm.put(27, "geetkumar");
		hm.put(14, "nayan");
		hm.put(1, null);
		hm.put(null,null);
		hm.put(1995,"mayank");
		System.out.println(hm);
//get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		String a=hm.get(14);
		System.out.println(a);
//remove(Object key): Removes the mapping for the specified key from this map if present.
		System.out.println(hm.remove(1992));
//containsKey(Object key): Returns true if this map contains a mapping for the specified key.
		System.out.println(hm.containsKey(1995));
		System.out.println(hm.containsValue("kamesh"));
//keySet(): Returns a Set view of the keys contained in this map.
		System.out.println(hm.keySet());
		System.out.println(hm.values());
//entrySet(): Returns a Set view of the mappings contained in this map.
		Set<Entry<Integer,String>>entry=hm.entrySet();
		for(Entry<Integer,String> c:entry) 
		{
			System.out.println("keys:"+c.getKey()+" "+"values:"+c.getValue());
		}
		//Iterating Over Entry Set
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		// Get the iterator for the key set
        Set<Integer> keySet = hm.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
        
        //Iterating Over Values
        Collection<String> keyvalue = hm.values();
        Iterator<String> itr = keyvalue.iterator();
        while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		//clear
		hm.clear();
		System.out.println(hm);
	}
	
	
}

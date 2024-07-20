package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashset 
{
	//// Hetrogeniouse/Homorogeniouse
	//No Duplicates: Ensures no duplicate elements.
	//Unordered: Does not maintain insertion order.
	//Allows Null: Permits one null element.
	public static void main(String[] args) 
	{
		HashSet<String> hs= new HashSet<>();
		//add
		hs.add("rajesh");
		hs.add("pole");
		hs.add("mayank");
		hs.add("aditya");
		hs.add("geetkumar");
		hs.add(null);
		hs.add("rajesh");
		hs.add(null);
		System.out.println(hs);
// if we enter duplicate value and multiple null vale it will print only single value and only one null value
		
		//rest of the methods are same as arraylist ie. remove(),contains(),toaray(),clear(),size(),
		// we cannot retrieve data from set to do so we need to convert it in to arraylist 
		ArrayList al= new ArrayList(hs);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("aditya"));
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	
	
}

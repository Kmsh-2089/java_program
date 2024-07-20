package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
	// Hetrogeniouse/Homorogeniouse, order of insertion is maintain, duplicates and null values are allowed 
	// methods
	public static void main(String[] args) {
		ArrayList al = new ArrayList(10);

		// to add elements
		al.add("kamesh");
		al.add("1995");
		al.add("vaidya");
		al.add("aditya");
		System.out.println(al);
		// add(int index, E element): Inserts the specified element at the specified
		// position in the list.
		al.add(4, "Banduji");
		System.out.println(al);
		// get(int index): Returns the element at the specified position in the list
		Object s = al.get(3);
		System.out.println(s);
		// remove(int index): Removes the element at the specified position in the list.
		// al.remove(1);
		// al.remove("kamesh");
		System.out.println(al);
		// set(int index, E element): Replaces the element at the specified position in
		// the list with the specified element.
		al.set(2, "sandhya");
		System.out.println(al);
		// size(): Returns the number of elements in the list.
		int l = al.size();
		System.out.println(l);
		// isEmpty(): Returns true if the list contains no elements.
		System.out.println(al.isEmpty());
		// clear(): Removes all of the elements from the list
		// al.clear();
		System.out.println(al);
		// contains(Object o): Returns true if the list contains the specified element
		boolean a = al.contains("kamesh");
		System.out.println(a);
		// ndexOf(Object o): Returns the index of the first occurrence of the specified
		// element in the list, or -1 if the list does not contain the element.
		System.out.println(al.indexOf("aditya"));
		System.out.println(al.lastIndexOf("sandhya"));
		// toArray(): Returns an array containing all of the elements in the list in
		// proper sequence.
		Object[] ar = al.toArray();
		for (Object c : ar) {
			System.out.println(c);
		} 
		//iterator(): Returns an iterator over the elements in the list in proper sequence.
		 Iterator<String> it=al.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 

	}

}

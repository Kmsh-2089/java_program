package string_program;

import java.util.LinkedHashSet;

public class remove_duplicate {
	public static void main(String[] args)
	{
		String s = "kkaammeesshh";
		String remove=removeduplicate(s);
		System.out.println("string without duplicate is"+" "+remove);

	}
	public static String removeduplicate(String str) 
	{
		// create set to store character
		LinkedHashSet<Character> ls= new LinkedHashSet<>();
		//add character to set
		for(char c:str.toCharArray()) 
		{
			ls.add(c);
		}
		// buils result string
		StringBuilder sb= new StringBuilder();
		// add unique character
		for(char c:ls) 
		{
			sb.append(c);
		}
		return sb.toString();
	}

}

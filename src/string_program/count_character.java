package string_program;


import java.util.HashMap;
import java.util.Set;



public class count_character 
{
	 public static void main(String[] args) 
	 {
		String s="my name is kamesh";
		char a[]=s.toCharArray();
		// create map
		HashMap<Character ,Integer> count =new HashMap<>();
		// itereting using for each 
		for(char c:a) 
		{
			if(count.containsKey(c)) 
			{
				count.put(c, count.get(c)+1);
			}
			else 
			{
				count.put(c,1);
			}			
		}
		System.out.println(count);
	 }
}


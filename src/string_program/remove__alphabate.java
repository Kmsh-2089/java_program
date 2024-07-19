package string_program;

public class remove__alphabate 
{
	public static void main(String[] args) 
	{
		String s="k2a0m8e1s9h95";
		String numeric="";
		for(int i=0;i<s.length();i++) 
		{
			if(Character.isDigit(s.charAt(i))) 
			{
				numeric=numeric+s.charAt(i);
			}
		}
		System.out.println("string withot charcter is"+" "+numeric);
		System.out.println();
		String character="";
		for(int i=0;i<s.length();i++) 
		{
			if(!Character.isDigit(s.charAt(i))) 
			{
				character=character+s.charAt(i);
			}
		}
		System.out.println("string without numeric is"+" "+character);
	}

}

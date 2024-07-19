package string_program;

public class word_to_word_reverse 
{
	public static void main(String[] args) 
	{
		String s="i love my work";
		// split the string 
		String a[]=s.split(" ");
		//before reverse
		for(int i=0;i<=a.length-1;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//after reverse
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

package string_program;

public class swap_string 
{
	public static void main(String[] args)
	{
		String a="kamesh";
		String b="vaidya";
		// before swap
		System.out.println(a+"  "+b);
		// to swap
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+"  "+b);

		
		
	}
}

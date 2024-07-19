package string_program;

public class reverse_stirng 
{
	public static void main(String[] args) 
	{
		String s ="kamesh";
		//convert into array
		char a[]=s.toCharArray();
		// 1st method using for loop
		for(int i=a.length-1;i>=0;i--) 
		{
			//reverse string
			System.out.print(a[i]);
		}
		System.out.println();
		
		// 2ond method using string buffer 
		StringBuffer br= new StringBuffer(s);
		// reverse string 
		System.out.println(br.reverse());
		
		System.out.println();
		
		//3rd method using stringbuilder
		StringBuilder sb=new StringBuilder(s);
		//reverse string
		System.out.println(sb.reverse());
		
	}
	
}

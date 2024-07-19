package string_program;

public class duplicate 
{
	public static void main(String[] args) 
	{
		String s="kvattavkewa";
		// convert to array
		char a[]=s.toCharArray();
		//iterating using for loop
		System.out.print("duplicate elements are"+" ");
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i+1;j<s.length();j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.print(a[i]);
					
				}
			}
		}
	
		
	}
	
	
}

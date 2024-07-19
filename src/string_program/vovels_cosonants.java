package string_program;

public class vovels_cosonants 
{
	public static void main(String[] args) 
	{
	 String s="kamesh vaidya";
	 // convert in array 
	 char a[]=s.toCharArray();
	 // iterating using for loop
	 int k=0;
	 for(int i=0;i<=a.length-1;i++) 
	 {
		 if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') 
		 {
             k++;
         }
	 }
	 System.out.println("vowels in string "+k);
	 System.out.println("consonants in a string"+" "+(a.length-k));
	 
	}
	
}

package week2;

public class StringFunctions {
	
	public static String CheckAnagram(String s1 , String s2)
	{
		int count=0;
		for(int i = 0 ; i < s2.length() ; i++)
		{
			for(int j = 0 ; j < s1.length() ; j++)
			{ 
				if(s2.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
		}
		
		if(count==s2.length())
		{
			return "Strings are Anagram";
		}
		else
		{
			return "Strings are NOT-Anagram";
		}
	}
	
	public static boolean CheckPalindrome(String s1 )
	{
		int t = s1.length()-1;
		int count = 1;
		for(int i = 0 ; i < t/2 ; i++)
		{
			if(s1.charAt(i)==s1.charAt(t))
			{
				count++;
				t--;
			}
		}
		if(count==s1.length()/2)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(CheckAnagram("earth", "heart"));
		System.out.println(CheckPalindrome("atoyota"));
	}

}

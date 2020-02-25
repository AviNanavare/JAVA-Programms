package week2;
import java.util.ArrayList;
public class stringReverse {
	public static void main(String[] args) {
		ArrayList<String> s1 = new ArrayList<String>();
		String str1 = "my name is ayushi";
		String strike = "";
		int count1 = 0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==' ')
			{
				s1.add(strike);
				count1++;
				strike="";
			}
			else
			{
				strike = strike +str1.charAt(i);
			}
			if(i==str1.length()-1)
			{
				s1.add(strike);
			}
 		}
		
		String[] arrOfStr = new String[count1+1];
		for(int i = 0 ; i < s1.size() ; i ++)
		{
			arrOfStr[i]=s1.get(i);
		}
		String[] newStr = new String[arrOfStr.length];
		
		for(int i = 0 ; i < arrOfStr.length ; i++)
		{
			String str2 = "";
			int count = arrOfStr[i].length();
			for(int j = 0 ; j < count ; j++)
			{
				str2 =  arrOfStr[i].charAt(j) + str2;
			}
			newStr[i]=str2;
//			System.out.println(" "+str2);
//         G3_code
		}
		System.out.println(str1);
		for(int i = 0 ; i < arrOfStr.length ; i++)
		{
			System.out.print(newStr[i]+" ");
		}	
	}
}

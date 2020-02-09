package week1;
import java.util.Scanner;
/* Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and  Alice." */
public class PrintThreeNames {

	public void foo()
	{
		System.out.println("this is foo method ");
	}
	public void bar()
	{
		System.out.println("this is bar method ");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String  oldString = scanner.nextLine();
		String[] arrStrings = oldString.split(" ");
		String newString1 = "";
//		for (String a : arrStrings) 
//		{   System.out.println(a);}
		scanner.close();
		for(int i=0;i<arrStrings.length-2;i++)
		{
			newString1 = newString1+""+arrStrings[i]+" , ";
		}
		newString1 = newString1+""+arrStrings[arrStrings.length-2]+" and "+arrStrings[arrStrings.length-1];
	
		System.out.println(oldString+" "+arrStrings.length);
		System.out.println(newString1);
		
	}

}

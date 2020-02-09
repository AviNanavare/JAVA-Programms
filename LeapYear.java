package week1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int year = scanner.nextInt();
		
        int year1=year/100;
		int year2=year1*100;
		
		if(year%4==0)
		{
			if(year==year2)
			{
				if(year%400==0)
				{	System.out.println("Entered Year is Leap-Year");	}
				else
				{	System.out.println("Entered Year is NOT a Leap-Year");	}
			}
			else
			{	System.out.println("Entered Year is Leap-Year");	}
		} 
		else
		{	System.out.println("Entered Year is NOT a Leap-Year");	}
		scanner.close();
	}
}

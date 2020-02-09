package week1;
import java.util.Scanner;

/* Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.  */

public class SpringSeason {
	public void springVala(int M , int D)
	{
		if(M==3)
		{
			if(D>=20 && D<=31)
			{		System.out.println("True");			}
			else
			{		System.out.println("False");			}			
		}
		else if(M==4)
		{
			if(D>=1 && D<=30)
			{		System.out.println("True");			}
			else
			{		System.out.println("False");			}			
		}
		else if(M==5)
		{
			if(D>=1 && D<=31)
			{		System.out.println("True");			}
			else
			{		System.out.println("False");			}			
		}
		else if(M==6)
		{
			if(D>=1 && D<=20)
			{		System.out.println("True");			}
			else
			{		System.out.println("False");			}			
		}
		else
		{		System.out.println("False");		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Month and Day : ");

		int M=scanner.nextInt();
		int D=scanner.nextInt();
		
		SpringSeason s1 = new SpringSeason();
		s1.springVala(M, D);
		
		scanner.close();
		}

}

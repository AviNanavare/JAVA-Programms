package week1;
import java.util.Scanner;

//  Write a program DayOfWeek.java that takes a date as input and prints the day of
//the week that date falls on. Your program should take three command­line
//arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February,
//and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
//Use the following formulas, for the Gregorian calendar (where / denotes integer
//division):
//y0 = y−(14−m)/12
//x = y0+ y0/4−y0/100+y0/400
//m0 = m+12×((14 − m)/12)−2
//d0 = (d+x+31m0/12) mod 7	

public class DayofWeek {
	
	public int DayNumber( int m , int d , int y )
	{
		int y1 = y - ( 14 - m ) / 12 ;
		int x = y1 + (y1/4) - (y1/100) + (y1/400) ;  
		int m1 = m + 12 * ((14 - m) / 12 ) - 2 ;
		int d1 = (( d + x + ( 31 * m1 ) / 12) % 7 );
		return d1;
	}
	
	public void DayString(int d1)
	{
		switch(d1) {
		case 0: System.out.println("It's Sunday");
				break;
		case 1: System.out.println("It's Monday");
				break;
		case 2: System.out.println("It's Tuesday");
				break;
		case 3: System.out.println("It's Wednsday");
				break;
		case 4: System.out.println("It's Thursday");
				break;
		case 5: System.out.println("It's Friday");
				break;
		case 6: System.out.println("It's Saturday");
				break;
		}
	}
// Leap Year	
	public void NoLeapYear(int m , int d , int y)
	{
		if( m==1 ||  m==3 || m==5 || m==7 || m==9 || m==11 )
		{
			if( d>=1 && d<=31)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else if( m==4 ||  m==6 || m==8 || m==10 || m==12 )
		{
			if( d>=1 && d<=30)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else if( m==2 )
		{
			if( d>=1 && d<=29)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else
		{
			System.out.println("You Have Entered Wrong Month");
		}
	}

// NO-Leap Year
	public void LeapYear(int m , int d , int y)
	{
		if( m==1 ||  m==3 || m==5 || m==7 || m==9 || m==11 )
		{
			if( d>=1 && d<=31)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else if( m==4 ||  m==6 || m==8 || m==10 || m==12 )
		{
			if( d>=1 && d<=30)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else if( m==2 )
		{
			if( d>=1 && d<=28)
			{
				DayString(DayNumber(m, d, y));
			}
			else
			{
				System.out.println("You Have Entered Wrong Day");
			}
		}
		else
		{
			System.out.println("You Have Entered Wrong Month");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		DayofWeek dw = new  DayofWeek();
		
		int m,d,y=0;
		
		System.out.println("Enter Date as MONTH , DAY , YEAR : ");
		m=s1.nextInt();
		d=s1.nextInt();
		y=s1.nextInt();
		
		int year1=y/100;
		int year2=year1*100;
			
		if(y%4==0)
		{
			if(y==year2)
			{
				if(y%400==0)
				{	//leap
					dw.LeapYear(m, d, y);
				}
				else
				{	//noleap
					dw.NoLeapYear(m, d, y);
				}
			}
			else
			{	//leap
				dw.LeapYear(m, d, y);
			}
		} 
		else
		{	//noleap
			dw.NoLeapYear(m, d, y);
		}
		s1.close();
}
}

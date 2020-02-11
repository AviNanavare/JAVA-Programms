package week1;

import java.util.Scanner;

/* Write a program WindChill.java that takes two double command­line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to
be: w=35.74+0.6215t+(0.4275t-35.75)*v^0.16.
Note : the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range). */

public class WindChill {
	public Double value( Double t , Double v )
	{
		Double a,b,c;
		a = (0.4275*t - 35.75)*Math.pow(t,0.16);
		b = a + 0.6325*t;
		c = 35.74 + a + b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WindChill w1 = new WindChill();
		System.out.println("Enter Arguments temp.(t in fahrenheit) & Wind Speed (v in mph) :");
		Double t = sc.nextDouble();
		Double v= sc.nextDouble();
		if(t<50 && v>3 && v<120)
		{
			System.out.println("Wind Chill (temp in degree fahrenheit) : "+String.format("%.2f", w1.value(t, v)));
		}
		else
		{
			System.out.println(" -: You Have Entered Wrong Input :- ");
		}
		sc.close();
	}

}

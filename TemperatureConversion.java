package week1;

import java.util.Scanner;

/* Write a TemperaturConversion.java program, given the temperature in fahrenheit
as input outputs the temperature in Celsius or viceversa using the formula
Celsius  to  Fahrenheit:    (°C  ×  9/5)  +  32  =  °F
Fahrenheit  to  Celsius:    (°F  −  32)  x  5/9  =  °C */

public class TemperatureConversion {
	public void CelciusToFahrenheit(double c)
	{
		double a = (c *(9/5))+32;
		System.out.println("Temp in Fahrenheit : "+a);
	}
	public void FahrenheitToCelcius(double f)
	{
		double b = ( f - 32 ) * ( 5 / 9 )  ;
		System.out.println("Temp in Fahrenheit : "+b);
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		TemperatureConversion t1 = new TemperatureConversion();
		System.out.println("Enter What You Want to do (1. celcius to fahrenheit , 2. fahrenheit to celcius ) : ");
		double choice = sc.nextDouble();
		if(choice==1)
		{
			System.out.println("Enter Temp. in Celsius : ");
			double c = sc.nextDouble();
			t1.CelciusToFahrenheit(c);
		}
		else if(choice==2)
		{
			System.out.println("Enter Temp. in Celsius : ");
			double f = sc.nextDouble();
			t1.FahrenheitToCelcius(f);
		}
		else
		{
			System.out.println(" -: Wrong Choice :- ");
		}
		sc.close();
	}

}

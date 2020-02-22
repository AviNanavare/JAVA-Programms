package week2;

import java.util.Scanner;

public class MathFunction1 {
	
	static double HarmonicNum(int n)
	{
		double total = 0;
		for(double i = 1 ; i < n ; i++)
		{
			total = total + ( 1 / i );
		}
		return total;		
	}
	
	static double SinAngle(int n)
	{
		double b = Math.toRadians(n);
		return Math.sin(b);
	}
	
	static double CosineAngle(int n)
	{
		double b = Math.toRadians(n);
		return Math.cos(b);
	}
	
	static String BinaryNum(int a)
	{
		return Integer.toBinaryString(a);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Harmonic/SinAngle/CosineAngle/BinaryNum");
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Harmonic number is : "+HarmonicNum(n));
		System.out.println("Sine of number is : "+SinAngle(n));
		System.out.println("Cosine of number is : "+CosineAngle(n));
		System.out.println("Binary Number is : "+BinaryNum(n));
		

		sc.close();
	}

}

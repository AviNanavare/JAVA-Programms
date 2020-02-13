package week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HarmonicNumber {

	private static DecimalFormat df1 = new DecimalFormat("#.####");
	private static DecimalFormat df2 = new DecimalFormat("#");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'n' number");
		double n = sc.nextInt();
		double total = 0;
		for(double i = 1 ; i < n ; i++)
		{
			total = total + ( 1 / i );
		}
		System.out.println( df2.format(n)+"th Harmonic Number is : "+df1.format(total) );
		sc.close();
	}
}

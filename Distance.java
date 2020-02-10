package week1;	
import java.text.DecimalFormat;
import java.util.Scanner;

/* Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */

public class Distance {
	
	private static DecimalFormat df1 = new DecimalFormat("#.##");
	
	Distance(double x, double y)
	{
		double val = (x*x)+(y*y);
		double Ed = Math.pow(val,0.5);
		System.out.println("Euclidean distance from the point (x,y) to (0,0) is "+df1.format(Ed));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Arguments as ( X , Y ) : ");
		
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		new Distance(x, y);
		
		sc.close();
	}
}

package week1;
import java.util.Scanner;

/* Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. */

public class Quadratic {

	public double Delta(double a , double b , double c) 
	{
		double del = (b*b) - (4*a*c);
		return Math.sqrt(del);
	}
	public static void main(String[] args) {
		Quadratic q1 = new Quadratic();
		Scanner s1 = new Scanner(System.in);
		System.out.println(" ax^2 + bx + c = 0 ");
		System.out.println("Enter Variables (a,b,c) : ");
		
		double a = s1.nextInt();
		double b = s1.nextInt();
		double c = s1.nextInt();
		
		double Root1=((-b+q1.Delta(a, b, c))/2*a);
		double Root2=((-b-q1.Delta(a, b, c))/2*a);
		
		System.out.println("Roots are "+Root1+" & "+Root2);
		s1.close();
	}

}

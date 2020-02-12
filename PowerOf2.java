package week1;
import java.util.Scanner;

public class PowerOf2 {
//	Write a program PowerOf2.java that takes a command­line argument n and prints a
//	table of the powers of 2 that are less than or equal to 2^n.
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter 'n' Number : ");
		int a = s2.nextInt();
		for(int i = 1 ; i<=a ; i++)
		{
			double pow = Math.pow(2 , i);
			System.out.println(" 2 ^ "+i+" = "+pow);
		}
		s2.close();
	}

}

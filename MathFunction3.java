package week2;

import java.util.Scanner;

public class MathFunction3 {

	public static long factorial(int n)
	{
		int total = 1;
		for(int i = n ; i >1 ; i --)
		{
			total = total * i;
		}		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Factorial of a Number");
		System.out.println("Enter Num : ");
		int n1 = sc.nextInt();
		System.out.println("Factorial is : "+factorial(n1));
		
		sc.close();
	}

}

package week2;

import java.util.Scanner; 

public class MathFunction2 {

	static boolean isPrime(int n)
	{
		int count = 0 ;
		for(int i = 3 ; i < n/2 ; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Is Prime Number");
		System.out.println("Enter Number For Check : ");
		int a = sc.nextInt();
		System.out.println("Num is Prime : "+isPrime(a));
		sc.close();
	}

	

}

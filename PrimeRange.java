package week1;

import java.util.Scanner;

public class PrimeRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Range (Start) : ");
		int start = sc.nextInt();
		System.out.println("Enter Range (End) : ");
		int end = sc.nextInt();
		
		for( int i = start ; i <= end ; i++ )
		{ 
			int count=0;
			for( int j = 2 ; j < i ; j++ )
			{
				if( i % j == 0 ) 
				{
					count++;
					break;
				}
			}
			if( count == 0 )
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}

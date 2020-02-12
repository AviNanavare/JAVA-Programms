package week1;

import java.util.Random;
import java.util.Scanner;

//Write a program FlipCoin.java to simulate a coin flip and print out "Heads" or
//"Tails"  accordingly  and  finally  print  the  percentage  of  Head  vs  Tail
 
public class CoinFlip {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k=0;
		int n=0;
		Random r1 = new Random();
		System.out.println("Enter Choice ( 1.Flip Coin , 2.Stop ) : ");
		while(true)
		{
			int choice = sc.nextInt();
			if(choice==1)
			{
				int coin = r1.nextInt(2);
				if(coin==1)
				{		System.out.println("H");		k++;n++;}
				else
				{		System.out.println("T");		k++;}
			}
			else if(choice==2)
			{
				System.out.println("Head : "+((n*100)/k)+"%");
				System.out.println("Tail   : "+(((k-n)*100)/k)+"%");
				sc.close();
				n=0;k=0;
				break;
			}
			else
			{		System.out.println("You Have Entered Wrong Choice");			}		
		}	
	}

}

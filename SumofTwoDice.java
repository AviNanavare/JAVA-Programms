package week1;
import java.util.Random;

/*Write a program SumOfTwoDice.java that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice) */

public class SumofTwoDice {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(6);
		int b = random.nextInt(6);
		
		System.out.println("Dice value is "+(a+b));

	}

}

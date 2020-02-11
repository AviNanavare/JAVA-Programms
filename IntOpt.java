package week1;
import java.util.Scanner;
/* Write a IntOpt.java program by taking a, b and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please
also  understand  the  precedence  of  the  operators */
public class IntOpt {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number a,b,c : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int num1 = (b*c)+a;
		int num2 = (a*b)+c;
		int num3 = (a/b)+c;
		int num4 = (a%b)+c;
				
		System.out.println("a + b * c = "+num1);
		System.out.println("a * b + c = "+num2);
		System.out.println("a / b + c = "+num3);
		System.out.println("a % b + c = "+num4);
		
		scanner.close();
		}
}

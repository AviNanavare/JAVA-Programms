package week2;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		//User Input
		int x = 100;
		int y = 24;
		
		int temp = 0 ; int val = 0;
		if(x>y) {temp = y;	}else {temp = x;}
		for(int i=1;i<temp;i++)
		{
			if((x%i==0)&&(y%i==0))
			{
				val = i ;
			}
		}
		System.out.println("Greatest Common Divisor : "+val);
	}
}

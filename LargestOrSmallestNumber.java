package week1;
//Write a program to find the 2nd largest and the 2nd smallest element from an
//unsorted array and without sorting the array.
public class LargestOrSmallestNumber {

	public static void main(String[] args) {
		int arr[] = new int[] {45,37,2,9,65,78,7,32,97};
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number In Array : "+max);
		int min = max;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum Number In Array : "+min);
	}

}

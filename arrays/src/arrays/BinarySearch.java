package arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter"+arr.length+"elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1; 
		while(low<=high)
			{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key found at"+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			}
		System.out.println("Key not found");
		scan.close();
	}

}

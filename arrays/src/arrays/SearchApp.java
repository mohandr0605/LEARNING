package arrays;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//if array is not sorted, sorting it by using bubble sort
		//bubble sort method calling for sorting an array
		BubbleSort_usingMethod sort=new BubbleSort_usingMethod();
		sort.bubbleSort(arr);
		System.out.println("Entered array element after sorting is");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Enter Key To Search");
		int key=scan.nextInt();
		int res=BinarySearch_usingMethod.binarySearch(arr,key);
		if(res>=0)
		{
			System.out.println("Key Found At the Index "+res);
		}
		else
		{
			System.out.println("Key Not Found");
		}
scan.close();
}
}

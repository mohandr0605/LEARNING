package arrays;

import java.util.Scanner;

public class array_practice3_copy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int arr2[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
          scan.close();
	}

}

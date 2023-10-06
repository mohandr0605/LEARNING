package arrays;

import java.util.Scanner;

public class Length_as_input1d {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		//int len=scan.nextInt();
		int arr[]=new int[scan.nextInt()]; //len inside bracket
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the value");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}

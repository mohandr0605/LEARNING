package arrays;

import java.util.Scanner;

public class array_practice4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1d length");
		String arr[]=new String[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the value");
			arr[i]=scan.next();
		}
		System.out.println("Array content are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();

	}

}

package arrays;

import java.util.Scanner;

public class Length_as_input2d_jagged {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length of 1d array");
		int arr[][]=new int[scan.nextInt()][];
		//2nd dimension array creation
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2d length for 1st dimension"+i);
			arr[i]=new int[scan.nextInt()];	
		}
		//storing logic
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter an element");
					arr[i][j]=scan.nextInt();				
			}
		}
		System.out.println("Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
		
	}

}

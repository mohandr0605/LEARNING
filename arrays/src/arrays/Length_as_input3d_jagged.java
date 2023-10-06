package arrays;

import java.util.Scanner;

public class Length_as_input3d_jagged {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of 1d of 3d jagged array");
	int arr[][][]=new int[scan.nextInt()][][];
	//2nd dimension array creation
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the length of 2nd dimension"+i);
		arr[i]=new int[scan.nextInt()][];
	}
	//3rd dimension array creation
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the length of 3rd dimension for 1st d"+i+"2nd d"+j);
			arr[i][j]=new int[scan.nextInt()];
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter an element");
				arr[i][j][k]=scan.nextInt();
			}
		}
	}
	System.out.println("Array Contents Are...");
	for(int i=0;i<=arr.length-1;i++)
	{
		for (int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.print(arr[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	scan.close();

	}

}

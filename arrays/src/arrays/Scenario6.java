package arrays;

import java.util.Scanner;

public class Scenario6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][]arr=new int[3][];  //jagged array. j have 3blocks,2blocks,4blocks
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		for(int i=0;i<=arr.length-1;i++)	
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the age of class "+i+" students "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			scan.close();
		}

	}

}

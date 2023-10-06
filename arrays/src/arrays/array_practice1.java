package arrays;

import java.util.Scanner;

public class array_practice1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double arr[][]=new double[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter"+i+"and"+j);
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
		}
		scan.close();
	}

}

/* 
2
2
enter0and0
15000
enter0and1
16000
enter1and0
17000
enter1and1
20000
15000.0 16000.0 
17000.0 20000.0 
 */

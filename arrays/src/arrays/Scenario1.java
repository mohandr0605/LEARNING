package arrays;

import java.util.Scanner;

public class Scenario1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
     System.out.println("Enter the marks of student "+i);
	  arr[i]=scan.nextInt();
	  }
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" | ");
	}
	scan.close();
	}

}

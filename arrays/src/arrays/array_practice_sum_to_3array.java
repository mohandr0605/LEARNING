package arrays;

import java.util.Scanner;

public class array_practice_sum_to_3array {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter length of the arrays");
		int arr1[]=new int[scan.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("Enter "+arr1.length+" Elements ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
        System.out.println("Enter "+arr2.length+" Elements ");
        for(int i=0;i<=arr2.length-1;i++)
        {
        	arr2[i]=scan.nextInt();
        }
        int arr3[]=new int[arr1.length];
        for(int i=0;i<=arr1.length-1;i++)
        {
        	arr3[i]=arr1[i]+arr2[i];
        }
        System.out.print("arr1-->");
        for(int i=0;i<=arr1.length-1;i++)
        {
        	System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("arr2-->");
        for(int i=0;i<=arr2.length-1;i++)
        {
        	System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.print("arr3-->");
        for(int i=0;i<=arr3.length-1;i++)
        {
        	System.out.print(arr3[i]+" ");
        }
		scan.close();
}
}

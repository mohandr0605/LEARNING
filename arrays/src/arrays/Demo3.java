package arrays;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int arr[]=new int[3];
		 //but it is not up to company standard
//coz lower bound (initialization) is ok. it can hardcode
//but upper bound ( condition) is not hardcode
		 //hardcode - directly writing value
		 // i<=2--->i<=arr.length-1;
		for(int i=0;i<=2;i++)
		{
		System.out.println("Enter an element");
		arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements are...");
		for(int i=0;i<=2;i++)
		{
		System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
 //redundancy eliminated using for loop
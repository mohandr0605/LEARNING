package arrays;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int arr[]=new int[3];
	//code redundancy here... so it is resolved in demo3
	System.out.println("Enter an element");
	arr[0]=scan.nextInt();
	System.out.println("Enter an element");
	arr[1]=scan.nextInt();
	System.out.println("Enter an element");
	arr[2]=scan.nextInt();
	scan.close();
	System.out.println("Array Elements are...");
	System.out.print(arr[0]+" ");
	System.out.print(arr[1]+" ");
	System.out.print(arr[2]+" ");
	



	}

}

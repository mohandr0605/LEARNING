package arrays;

import java.util.Scanner;

public class Scenario5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String [][]Bank_customer=new String[5][6];
		for(int i=0;i<=Bank_customer.length-1;i++)
		{
			for(int j=0;j<=Bank_customer[i].length-1;j++)
			{
				System.out.println("enter the bank "+i+" and customer "+j);
				Bank_customer[i][j]=scan.next();
			}
		} //done with the storage part next do retrieval part in next lines
		System.out.println("Array contents are...");
		for(int i=0;i<=Bank_customer.length-1;i++)
		{
			for(int j=0;j<=Bank_customer[i].length-1;j++)
			{
				System.out.print(Bank_customer[i][j]);
			}
			System.out.println();
			scan.close();
		}
	}

}

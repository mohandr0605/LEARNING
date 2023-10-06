package arrays;

import java.util.Scanner;

public class Scenario2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String emp[]=new String[8];
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println("Enter the Names of the Employees");
			emp[i]=scan.next();
		}
		System.out.println("Names Of The Employee");
         for(int i=0;i<=emp.length-1;i++)
         {
        	 System.out.print(emp[i]+" | ");
         }
         scan.close();
	}

}
 
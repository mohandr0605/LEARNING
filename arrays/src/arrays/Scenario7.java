package arrays;

import java.util.Scanner;

     public class Scenario7{
     public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				double [][]arr=new double[6][];  //jagged array. j have 3blocks,2blocks,4blocks
				arr[0]=new double[3];
				arr[1]=new double[2];
				arr[2]=new double[1];
				arr[3]=new double[6];
				arr[4]=new double[5];
				arr[5]=new double[4];
				for(int i=0;i<=arr.length-1;i++)	
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						System.out.println("Enter the height of game "+i+" players "+j);
						arr[i][j]=scan.nextDouble();
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

		        


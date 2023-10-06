package arrays;

import java.util.Scanner;

public class Scenario3 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    float height[]=new float[10];
    for(int i=0;i<=height.length-1;i++)
    {
    	System.out.println("Enter height of players");
    	height[i]=scan.nextFloat();
    }
        System.out.print("height[]----> | ");
    for(int i=0;i<=height.length-1;i++)
    {
    	System.out.print(height[i]+" | ");
    }
    scan.close();
	}

}

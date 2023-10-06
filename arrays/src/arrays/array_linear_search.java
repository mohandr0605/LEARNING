package arrays;

import java.util.Scanner;

public class array_linear_search {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
	System.out.println("enter"+arr.length+"elements");
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    arr[i]=scan.nextInt();
	    }
	System.out.println("enter the key to search");
	    int key=scan.nextInt();
	    boolean flag=false;
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	if(key==arr[i])
	    	{
	    		System.out.println("key found at "+i);
	    		//System.exit(0);
	    		//return;
	    		flag=true;
	    	}
	    }
	    if(flag==false)
	    {
	    	 System.out.println("key not found");
	    }
	   scan.close();
}

}

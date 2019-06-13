package project_DT_20;
import java.util.Scanner;
public class GCD
{
	 public static void main(String args[])
	 {
	     long x,y;
	     @SuppressWarnings("resource")
	     Scanner sc=new Scanner(System.in);
		    System.out.print("Enter x value :");
		    x=sc.nextLong();
		   
		    System.out.print("Enter y value :");
		    y=sc.nextLong();
		    while(x!=y)
		    {
		    	if(x>y)
		    	{
		    		x=x-y;
		    	}
		    	else
		    		{
		    		y=y-x;
		    	}
		    }
		    System.out.println("GCD of 2 no's is ="+x);
	 }
	 
}

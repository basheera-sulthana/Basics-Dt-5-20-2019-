package project_DT_20;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
    {
    	
    	int n,i;
    	int fact=1;
    	@SuppressWarnings("resource")
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter n value");
   	     n=sc.nextInt();
   	     for(i=1;i<=n;i++)
   	     {
   	    	 fact=fact*i;
   	    	
   	     }
   	  System.out.println("Factorial for " +n + " is ="+fact);
    }
}

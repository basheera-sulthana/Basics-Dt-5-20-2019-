package project_DT_20;
import java.util.Scanner;
public class Armstrong 
{
	 public static void main(String args[]) 
     { 
		  int n,arm=0,temp,a;
		  @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
		 {
	    	System.out.println("Enter a no. to check whether it is a Armstrong number or not\n");
	   	     n=sc.nextInt();
		 }
	   	     temp=n;
	   	     for( ;n!=0;n/=10)
	   	     {
	   	    	 a=n%10;
	   	    	 arm=arm+(a*a*a);
	   	     }
	   	     if(arm==temp)
	   	     {
	   	    	 System.out.println("The given number is Armstrong");
	   	     }
	   	     else
	   	     {
	   	    	 System.out.println("The given number is not a Armstrong");
	   	     }
     }
}

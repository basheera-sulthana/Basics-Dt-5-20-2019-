package project_DT_20;
import java.util.Scanner;

public class Leap_year 
{
	public static void main(String args[])	
	{
	    long a,y,c;
	    @SuppressWarnings("resource")
             	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter  any  calendar year :");
                   y=sc.nextLong();	     
	    if(y!=0)
	    {
		a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));       
		if(a==1) 
		    System.out.println(y+" is a leap year");       
               	else
		    System.out.println(y+" is not a leap year");                       
	    }
	    else
		System.out.println("year zero does not exist ");                       
 	}
}

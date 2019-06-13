package project_DT_20;
import java.util.Scanner;
public class Cone_Volume
{
	     public static void main(String args[])
	     {
	    	 @SuppressWarnings("resource")
	    	 Scanner sc=new Scanner(System.in);
	    	 double pi=3.147;
	    	 double r;
	    	 System.out.println("Enter radius");
	    	 r=sc.nextDouble();
	    	 double h;
	    	 System.out.println("Enter height");
	    	 h=sc.nextDouble();
	    	
	    	 double res;
	    	 res=pi*r*r*(h/3);
	    	 System.out.println("Cone volume is ="+res);
	     }
	}



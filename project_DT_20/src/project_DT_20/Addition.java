package project_DT_20;
import java.util.Scanner;
public class Addition 
{
public static void main(String args[])
{
	int a,b;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	     a=sc.nextInt();
	     System.out.println("Enter b value");
	     b=sc.nextInt();
	        
	    
	System.out.println("Addition of 2 no's is="+(a+b));
}
}
package project_DT_20;
import java.util.Scanner;
public class Fib
{
   public static void main(String args[])
    {
    	int a=0,b=1,c;
    	int n;
    	@SuppressWarnings("resource")
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter n value");
   	     n=sc.nextInt();
    	System.out.println("Fibannoci series are ="+a);
		System.out.println("Fibannoci series are ="+b);
    	do 
    	{
    		c=a+b;
    		a=b;
    		b=c;
    		System.out.println("Fibannoci series are ="+c);
    	}while(c<n);
    }
}



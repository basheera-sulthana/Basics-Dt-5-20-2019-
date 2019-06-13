package project_DT_20;
import java.util.Scanner;
public class Ncr_Npr 
{
	double fact(double n)
	{
	int i=1;
             	    double fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i++;
 	    }
  	      return fact;
	}
public static void main(String arg[])	
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
               int n=sc.nextInt();
	System.out.println("Enter value of r");
               int r=sc.nextInt();
	if(n>=r)
	{
		System.out.println("The value of "+n+"p"+r+" is : "+npr(n,r));	
		System.out.println("The value of "+n+"c"+r+" is : "+ncr(n,r));
	}
	else
		System.out.println("Please enter n>=r");					
}
static double ncr(int n,int r)
{
	Ncr_Npr p=new Ncr_Npr( );
             	double nc=p.fact(n)/(p.fact(n-r)*p.fact(r));
	return nc;
}
static double npr(int n,int r)
{
	Ncr_Npr p=new Ncr_Npr( );
	double np=p.fact(n)/p.fact(n-r);	
	return np;
}
}


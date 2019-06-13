package project_DT_20;
import java.util.Scanner;
public class Power_in_java 
{
	  public static void main(String arg[])	
	  {
	    int n,p,result=1;
	    @SuppressWarnings("resource")
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter n value :");
	    n=sc.nextInt();
	    System.out.print("Enter p value(how many times to repeat):");
	    p=sc.nextInt();

	    if(n>=0&&p==0)
	     {
	        result=1;
	     }
	    else if(n==0&&p>=1)
	      { 
	         result=0;
	      }
	    else
	     {
	         for(int i=1;i<=p;i++)
		 {
	            result=result*n;
		 }
	     }     
	    System.out.println(n+"^"+p+"="+result);
		
	     }
	  }

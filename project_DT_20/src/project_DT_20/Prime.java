package project_DT_20;
import java.util.Scanner;
public class Prime 
{
 public static void main(String args[])
{
	int n;
	@SuppressWarnings("resource")
	  Scanner sc=new Scanner(System.in);
	    System.out.print("Enter n value :");
	    n=sc.nextInt();
	int count=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		{
			
			count++;
		
	
	}
	}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
System.out.println("No prime");
		}
}
}

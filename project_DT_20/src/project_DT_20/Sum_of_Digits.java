package project_DT_20;
import java.util.*;
public class Sum_of_Digits 
{
	public static void main(String arg[])
	  {
		 long sum=0;
		 long  n;
		 @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
		    System.out.print("Enter n value :");
		    n=sc.nextLong();
		 for(sum=0;n!=0;n/=10)
		 {
                sum+=n%10;
		 }
		 System.out.println(sum);
	  }
 }

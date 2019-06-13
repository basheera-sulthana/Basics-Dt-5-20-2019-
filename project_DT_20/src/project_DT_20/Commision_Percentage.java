package project_DT_20;
import java.util.Scanner;
public class Commision_Percentage 
{
	public static void main(String arg[])	
	{
        double amt;
        @SuppressWarnings("resource")
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amt:");
 
	   amt=sc.nextDouble();
 
	  System.out.print("Enter commissionPercentage:");
 
          double commissionPercentage=sc.nextDouble();
 
	  double commission=(commissionPercentage/100)*amt;  	   
 
      	  System.out.println("Commission amount="+commission);
 
	}
}

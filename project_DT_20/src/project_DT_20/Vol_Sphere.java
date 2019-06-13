package project_DT_20;
import java.util.Scanner;
public class Vol_Sphere 
{
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
    	 Scanner sc=new Scanner(System.in);
    	 double pi=3.14;
    	 double r;
    	 System.out.println("Enter radius");
    	 r=sc.nextDouble();
    	 double res;
    	 
    	 res=(4*pi*(r*r*r))/3;
    	 System.out.println("Volume of sphere is ="+res);
    }
    
}

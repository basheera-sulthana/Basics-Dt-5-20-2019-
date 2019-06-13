package project_DT_20;
import java.util.Scanner;
public class Perimeter_circle
{
     public static void main(String args[])
     {
    	 @SuppressWarnings("resource")
    	 Scanner sc=new Scanner(System.in);
    	 double pi=3.147;
    	 double dia;
    	 System.out.println("Enter dia");
    	 dia=sc.nextDouble();
    	 double r;
    	 System.out.println("Enter radius");
    	 r=sc.nextDouble();
    	 double res;
    	 res=dia*r*pi;
    	 System.out.println("Perimeter of circle is ="+res);
     }
}

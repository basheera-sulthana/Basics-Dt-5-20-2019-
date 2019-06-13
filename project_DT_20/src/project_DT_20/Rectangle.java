package project_DT_20;
import java.util.Scanner;
public class Rectangle 
{
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
    	 Scanner sc=new Scanner(System.in);
    	 int l;
    	 int b;
    	 System.out.println("Enter l value");
    	 l=sc.nextInt();
    	 System.out.println("Enter b value");
    	 b=sc.nextInt();
    	 int c;
    	 c=l*b;
    	 System.out.println("Area of rect is ="+c);

    }
}

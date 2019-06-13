package project_DT_20;
import java.util.Scanner;
public class Equilateral 
{ 
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
    	Scanner sc=new Scanner(System.in);
    	double a;
    	System.out.println("Enter A value");
    	a=sc.nextInt();
    	double res;
    	res=(Math.sqrt(3)/4)*(a*a);
    	System.out.println("Equivilateral triangle is ="+res);
    }
}

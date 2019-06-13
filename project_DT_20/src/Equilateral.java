
import java.util.Scanner;
import java.math.*;
public class Equilateral 
{ 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	double a;
    	System.out.println("Enter A value");
    	a=sc.nextInt();
    	double res;
    	res=(Math.sqrt(3)/4)*(a*a);
    	System.out.println("Equivilateral triangle is ="+res);
    }
}

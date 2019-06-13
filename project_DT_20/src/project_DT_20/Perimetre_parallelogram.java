package project_DT_20;
import java.util.Scanner;
public class Perimetre_parallelogram 
{
	public static void main(String args[])
    {
		@SuppressWarnings("resource")
            Scanner sc=new Scanner(System.in);
	    	 int h;
	    	 int b;
	    	 System.out.println("Enter l value");
	    	 h=sc.nextInt();
	    	 System.out.println("Enter b value");
	    	 b=sc.nextInt();
	    	 int c;
	    	 c=2*(h+b);
	    	 System.out.println("Area of parallelogram  is ="+c);

	    }
	}



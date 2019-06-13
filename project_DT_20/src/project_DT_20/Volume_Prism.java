package project_DT_20;
import java.util.Scanner;
public class Volume_Prism
{
        public static void main(String args[])
	    {
        	@SuppressWarnings("resource")
	    	 Scanner sc=new Scanner(System.in);
	    	 double base;
	    	 double height;
	    	 System.out.println("Enter base ");
	    	 base=sc.nextDouble();
	    	 System.out.println("Enter height ");
	    	 height=sc.nextDouble();
	    	 double c;
	    	 c=base*height;
	    	 System.out.println("Volume of Prism is ="+c);

	    }
	}



package project_DT_20;
import java.util.Scanner;
public class HCF 
{
	 public static void main(String args[]) 
     {
		 int n1,n2,temp;
		 @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter n1");
		    n1=sc.nextInt();
		    System.out.println("Enter n2");
		    n2=sc.nextInt();
             while(n2>0)
             {
            	 temp=n2;
            	 n2=n1%n2;
            	 n1=temp;
             }
             System.out.println(n1);
     }
}

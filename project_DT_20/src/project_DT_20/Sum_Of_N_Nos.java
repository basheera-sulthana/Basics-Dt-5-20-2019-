package project_DT_20;
import java.util.Scanner;
public class Sum_Of_N_Nos 
 {
			  public static void main(String args[]) 
		      {   
				  int n,i;
				  int res=0;
				  @SuppressWarnings("resource")
				  Scanner sc=new Scanner(System.in);
			    	System.out.println("Enter how many no.'s u want");
			   	     n=sc.nextInt();
			   	     int a[]=new int[n];
			   	  System.out.println("Enter numbers");
			   	     for(i=0;i<n;i++)
			   	     {
			   	    	 a[i]=sc.nextInt();
			   	     }
			   	  for(i=0;i<n;i++)
			   	     {
			   	          res=res+a[i];
			   	     }
			   	  
			   	System.out.println("The avg of above marks is = "+res);
		      }
			  
		      
		}





package project_DT_20;

public class Depreciation 
{
     public static void main(String args[])
     {
    	  long amt,deprecent,year,temp;
    	  amt=100000;
    	  deprecent=10;
    	  year=3;
    	  temp=amt;
    	  for(int i=0;i<year;i++)
    	  {
    		  temp=((100-deprecent)*temp)/100;
    	  }
    	  System.out.println("After deprecention = "+temp);
     }
}

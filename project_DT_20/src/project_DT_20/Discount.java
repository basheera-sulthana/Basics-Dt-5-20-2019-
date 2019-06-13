package project_DT_20;

public class Discount
{
	
		public static void main(String args[])
		{
	 
		double  discount,amount,markedprice,s;
	               
		markedprice=1000;
	 
	        discount=25;  		
		
		System.out.println("markedprice= "+markedprice);
	 
		System.out.println("discount rate="+discount);
	         
	        s=100-discount;
	 
		amount= (s*markedprice)/100;
	 
		System.out.println("amount after discount="+amount);
	 
		}
	}

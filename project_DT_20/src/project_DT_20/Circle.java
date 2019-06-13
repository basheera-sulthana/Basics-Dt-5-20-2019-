package project_DT_20; 
class S1
{
   static double pi=3.147;
   double r=7;
   void  area()
   {
	   double c;
	   c=pi*r*r;
	   System.out.println("Area of circle is"+c);
   }
}
public class Circle 
{
	 public static void main(String args[])
	 {
		 S1  obj=new S1();
		 obj.area();
	 }
}
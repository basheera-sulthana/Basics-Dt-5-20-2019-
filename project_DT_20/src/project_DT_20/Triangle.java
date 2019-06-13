package project_DT_20;
class S2
{
	int b=10;
	int h=20;
	double half=0.5;
	void tri()
	{
		double t;
		t=half*b*h;
		System.out.println("Area of Triangle is ="+t);
	}
}

public class Triangle 
{
    public static void main(String args[])
    {
    	S2 obj=new S2();
    	obj.tri();
    }
}

package week3.day7;

public class Calculator {
	
	//2 Methods for add
	//1 Method with 2 int args
	public void add(int a, int b)	
	{
	  System.out.println(a+b);
	}
	
	//1 method with 3 int args
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	//2 Methods for multiple
	//1 method with 2 double args
	public void multiple(double c, double d) 
	{
	  System.out.println(c*d);
	}
	
	//1 method with 2 float args
	public void multiple(float c, float d)
	{
		System.out.println(c*d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.add(10, 5);
		cal.add(10, 5, 15);
		cal.multiple(20.12345678, 10.12345678);
		cal.multiple(20.05f, 10.05f);
		

	}

}

package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstnum=0;
		int secnum=1;
		int sum=0;
		
		System.out.println("The fibonacci series is :"+firstnum);
		System.out.println("The fibonacci series is :"+secnum);
		for (int range=0;range<=8;range++)
			
		{
		    sum=firstnum+secnum;
			System.out.println("The fibonacci series is :"+ sum);
			firstnum=secnum;
			secnum=sum;
		}	
		
		
		
		
		

	}

}

package week3.day7;

public class SmartPhone extends AndroidPhone {
	
	
	//Create a same method take video
	public void takeVideo()
	{
		System.out.println("This is a SmartPhone");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a object for classname smartphone
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
		
		}

}

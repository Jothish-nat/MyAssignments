package week1.day1;

public class Bike {
	
	public void driveBike() {
		System.out.println("driveBike");
		
	}
	
	public void applyBrake() {
		System.out.println("applyBrake");
	}
	
	public void soundHorn() {
		System.out.println("soundHorn");
		
	}
	
	public void isPuncture() {
		System.out.println("isPuncture");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike B = new Bike();
		B.driveBike();
		B.applyBrake();
		B.soundHorn();
		B.isPuncture();
		
	}
}

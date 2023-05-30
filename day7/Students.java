package week3.day7;

public class Students {
	
	public void getStudentInfo(int id)
	
	{
		System.out.println("ID : 1");
	}
	
	public void getStudentInfo(int id, String name)
	
	{
		System.out.println("ID : 2 and Name : Jothish");
	}
	public void getStudentInfo(String email, long phonenumber)
	{
	  System.out.println("Email : Jothish.testing@gmail.com  and Phonenumber : 1234567890");
	}
	
    public static void main(String[] args) {
	// TODO Auto-generated method stub
    	
    Students SR = new Students();
    SR.getStudentInfo(1);
    SR.getStudentInfo(2, "Jothish");
    SR.getStudentInfo("Jothish.testing@gmail.com", 1234567890);
    	
	}

}

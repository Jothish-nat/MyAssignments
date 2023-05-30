package week3.day7;
public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name");
	}
	
	public void studentDept()
	{
		System.out.println("Student Dept");
	}
	
	public void studentId()
	{
		System.out.println("Student ID");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.CollegeCode();
		s.CollegeName();
		s.CollegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
		

	}

}

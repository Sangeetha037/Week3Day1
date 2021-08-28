package week3.day1.assignment;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students details = new Students();
		details.getStudentInfo(12345);
		details.getStudentInfo(281059,"Vidhya");
		details.getStudentInfo("Vidhya.g@gmail.com",123456789);

	}

	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Student ID: " + id);

	}

	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		//System.out.println("ID of the Student " + id);
		System.out.println("ID and Student Name: " + id+","+name);

	}

	public void getStudentInfo(String email, long phone) {
		// TODO Auto-generated method stub
		System.out.println("Student Email: " + email);
		System.out.println("Student phone Nr: " + phone);

	}
}

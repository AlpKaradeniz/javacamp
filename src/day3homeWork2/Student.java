package day3homeWork2;

public class Student extends User{
	int studentNumber;

	public Student(String firstName, String lastName, int studentNumber) {
		super(firstName, lastName);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}

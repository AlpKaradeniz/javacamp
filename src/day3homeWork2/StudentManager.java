package day3homeWork2;

public class StudentManager extends UserManager{
	public void join(Student student) {
		System.out.println(student.firstName+" "+student.lastName + " kursa kat�ld�n�z.");
	}
	
	public void leave(Student student) {
		System.out.println(student.firstName+" "+student.lastName + " kurstan ayr�ld�n�z.");
	}
}

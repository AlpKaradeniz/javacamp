package day3homeWork2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student("Alp", "Karadeniz", 101);
		
		Instructor instructor = new Instructor("Engin", "Demirog", "Java ve C##");
		
		UserManager userManager = new UserManager();
		userManager.joinClass(instructor);
		userManager.leaveClass(instructor);
		 
		StudentManager studentManager = new StudentManager();
		studentManager.join(student);
		studentManager.leave(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.remove(instructor);
		instructorManager.update(instructor);		

	}
}

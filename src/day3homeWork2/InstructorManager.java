package day3homeWork2;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan kurs eklendi.");
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" taraff�ndan kurs silindi.");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" taraf�ndan kurs g�ncellendi.");
	}

}

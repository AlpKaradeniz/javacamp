package day3homeWork2;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan kurs eklendi.");
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" taraffýndan kurs silindi.");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" tarafýndan kurs güncellendi.");
	}

}

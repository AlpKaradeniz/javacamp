package day3homeWork2;

public class Instructor extends User{
	String profession;

	public Instructor(String firstName, String lastName, String profession) {
		super(firstName, lastName);
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}

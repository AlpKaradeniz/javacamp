package day3homeWork2;

public class UserManager {
	public void joinClass(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" derse katýldýnýz.");
	}
	
	public void leaveClass(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" dersten ayrýldýnýz.");
	}
}

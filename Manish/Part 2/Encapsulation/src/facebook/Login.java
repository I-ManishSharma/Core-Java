package facebook;

public class Login {

	public static void main(String[] args) {
		User u = new User();
		u.setUser_name("Arvikk");
		u.setPassword("@rvikk123");
		
		System.out.println(u.getUser_id());
		System.out.println(u.getUser_name());
	}
}

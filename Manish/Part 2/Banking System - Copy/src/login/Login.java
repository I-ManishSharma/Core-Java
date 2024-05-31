package login;

public class Login {
	
	public static boolean login(StringBuilder users, StringBuilder account, String name, String acc_number) {
		
		if (users.toString().contains(name) && account.toString().contains(acc_number)) {
			return true;
		} else {
			System.out.println("User and Account number invalid");
			System.out.println("Please Enter the Currect details OR Create Account if not.");
			return false;
		}
	}
}

package exception;

public class InvalidPassword extends Exception {
	
	@Override
	public String getMessage() {
		return "Invalid Password";
	}
}

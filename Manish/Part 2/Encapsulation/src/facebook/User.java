package facebook;

public class User {
	private String user_name;
	private String user_id = "iamArvikk";
	private String password;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

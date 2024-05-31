package exception;

//import java.io.BufferedReader;
import java.io.InputStreamReader;

public class login {
	
	private String name;
	private int id;
	
	public void getName(int id) {
		if (this.id == id) {
			System.out.println(name);
		} else {
			try {
				throw new InvalidPassword();
			}
			catch (InvalidPassword e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public login(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		login l = new login("Arvikk", 5);
		l.getName(6);
		System.out.println("tq");
		
		//BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		
	}
}

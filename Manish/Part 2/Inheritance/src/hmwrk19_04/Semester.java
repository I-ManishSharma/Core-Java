package hmwrk19_04;

public class Semester extends Internal {
	
	void sumMarks(int a, int b) {
		System.out.println("Sum of Marks = "+ (a+b));
	}

	void details(String cname, String name, String branch) {
		System.out.println("College name = "+ cname);
		System.out.println("Student name = "+ name);
		System.out.println("Branch name = "+ branch);
	}
	public static void main(String[] args) {
		Semester s = new Semester();
		s.sumMarks(s.mark1 , s.mark2);
		s.details(s.cname, s.name, s.branch);
	}

}

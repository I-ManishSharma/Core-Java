//Print total marks and percentage

class P6 {
	public static void main (String[] args) {
		int science = 78, socialScience = 89, maths = 99, english = 88, hindi = 67;
		int totalMarks = science+socialScience+maths+english+hindi;
		double percentage = (totalMarks* 100)/ 500.0;
		System.out.println("Total Marks = " + totalMarks);
		System.out.println("Percentage = " + percentage);
	}
}
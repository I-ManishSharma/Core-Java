class P41 {
	public static void total_mark(int science_marks,
			int social_science,
			int math_mark,
			int english_mark,
			int hindi_mark,
			int total_mark) {
		double total_mark_of_Ashish = ((double) (science_marks + english_mark + math_mark + social_science
				+ hindi_mark));
		double percentage_of_Ashish = ((double) (total_mark_of_Ashish / total_mark) * 100);

		System.out.println(total_mark_of_Ashish);
		System.out.println(percentage_of_Ashish);
	}

	public static void main(String[] args) {
		total_mark(78, 89, 99, 88, 67, 500);
	}
}
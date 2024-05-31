class BoolToInt {
	public static void main (String[] args) {
		boolean flag = true;
		int numflag = flag;		//Throw error
		int numflag = (int)flag;	//Throw error
		System.out.print(numflag);
	}
}

//NOTE: Both lines throw error because Boolean is the only primitive datatype that cannot be typeCast.
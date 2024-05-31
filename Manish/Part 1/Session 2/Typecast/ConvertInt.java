class ConvertInt {
	public static void main (String[] args) {
		int num = 69;
		byte numByte = (byte)num;
		short numShort = (short)num;
		long numLong = (long)num;
		float numFloat = num;
		double numDouble = num;
		char numChar = (char)num;
		System.out.println(num+" "+numByte+" "+numShort+" "+numLong+" "+numFloat+" "+numDouble+" "+numChar);
	}
}
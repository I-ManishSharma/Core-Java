class DigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		int unit=num%10;
		num=num/10;
		int tens=num%10;
		num=num/10;
		int hundreds=num%10;
		System.out.println("Unit Digit = " + unit);
		System.out.println("Tens Digit = " + tens);
		System.out.println("Hundreds Digit = " + hundreds);
	}
}
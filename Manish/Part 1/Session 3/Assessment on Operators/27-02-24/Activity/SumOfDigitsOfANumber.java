class SumOfDigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		int sum=0;
		int unit=num%10;
		sum+=unit;
		num=num/10;
		int tens=num%10;
		sum+=tens;
		num=num/10;
		int hundreds=num%10;
		sum+=hundreds;
		System.out.println("Unit Digit = " + unit);
		System.out.println("Tens Digit = " + tens);
		System.out.println("Hundreds Digit = " + hundreds);
		System.out.println("Sum of the Digits = " + sum);
	}
}
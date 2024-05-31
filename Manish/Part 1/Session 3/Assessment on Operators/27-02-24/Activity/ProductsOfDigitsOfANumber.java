class ProductsOfDigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		int pro=1;
		int unit=num%10;
		pro*=unit;
		num=num/10;
		int tens=num%10;
		pro*=tens;
		num=num/10;
		int hundreds=num%10;
		pro*=hundreds;
		System.out.println("Unit Digit = " + unit);
		System.out.println("Tens Digit = " + tens);
		System.out.println("Hundreds Digit = " + hundreds);
		System.out.println("Product of the Digits = " + pro);
	}
}
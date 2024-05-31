class SumOfPrimeDigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		int sum=0;
		num/=10;
		sum+=num%10;
		num/=10;
		sum+=num%10;
		System.out.println("Sum of Prime Digits of 537 are = " + sum);
	}
}
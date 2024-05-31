class SumOfEvenDigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		num/=10;
		int sum=0;
		sum+=num%10;
		System.out.println("Sum of Even Digits of 537 are = " + sum);
	}
}
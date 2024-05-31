class SumOfOddDigitsOfANumber
{
	public static void main(String[] args)
	{
		int num=537;
		int sum=0;
		sum+=num%10;
		num/=100;
		sum+=num%10;
		System.out.println("Sum of Odd Digits of 537 are = " + sum);
	}
}
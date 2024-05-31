public class P4 {
    static int evenDigitSum (int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0) sum += temp;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 56734;
        System.out.println(evenDigitSum(num));
    }
}

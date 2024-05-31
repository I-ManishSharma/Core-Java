public class P4 {
    public static void main(String[] args) {
        int n = 12345, sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            n /= 10;
        }
        System.out.println("Sum of all digits of number is "+ sum);
    }
}

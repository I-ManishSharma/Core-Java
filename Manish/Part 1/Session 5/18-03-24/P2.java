public class P2 {
    static int digitSum (int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 56734;
        System.out.println(digitSum(num));
    }
}

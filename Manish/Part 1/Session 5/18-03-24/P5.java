public class P5 {
    static int countDigit (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 56878734;
        System.out.println(countDigit(num));
    }
}

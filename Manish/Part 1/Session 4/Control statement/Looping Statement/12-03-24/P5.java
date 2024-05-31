public class P5 {
    public static void main(String[] args) {
        int n = 12345;
        while (n > 0) {
            int temp = n % 10;
            System.out.println(temp);
            n /= 10;
        }
    }
}

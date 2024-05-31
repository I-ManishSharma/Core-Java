public class P2 {
    public static void main(String[] args) {
        int n = 6, factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

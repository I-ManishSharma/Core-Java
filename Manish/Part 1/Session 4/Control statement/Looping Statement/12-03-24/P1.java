public class P1 {
    public static void main(String[] args) {
        int n = 21;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }         
        }
    }
}
public class P3 {
    public static void main(String[] args) {
        int m = 42, n = 69, even_count = 0, odd_count = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) even_count++; else odd_count++;
        }
        System.out.println("Count of Even and Odd numbers b/w "+ m + " and "+ n + " are "+ even_count+" " + odd_count);
    }
}

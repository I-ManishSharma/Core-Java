public class P8 {
    static int power (int base, int pwr) {
        int ans = 1;
        for (int i = 1; i <= pwr; i++) {
            ans *= base;
        }
        return ans;
    }
    public static void main(String[] args) {
        int base = 5, pwr = 3;
        System.out.println(power(base, pwr));
    }
}

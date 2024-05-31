public class P7 {
    static int factorial (int num) {
        int ans = 1;
        for (int i = num; i >= 1; i--) {
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
}

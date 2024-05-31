public class P3 {
    static int digitProduct (int num) {
        int product = 1;
        while (num > 0) {
            int temp = num % 10;
            product *= temp;
            num /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        int num = 56734;
        System.out.println(digitProduct(num));
    }
}

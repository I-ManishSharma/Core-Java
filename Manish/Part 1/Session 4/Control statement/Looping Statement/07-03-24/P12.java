public class P12 {
    public static void main(String[] args) {
        int num = 15;
        if ((num % 2 != 0 && num % 3 != 0) || (num % 2 == 0 && num % 3 != 0) || (num % 2 != 0 && num % 3 == 0)) {
            System.out.println("Number is not divisible by 6");
        } else {
            System.out.println("Number is divisible by 6");
        }
    }
}

public class P6 {
    static void printFactor (int num) {
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int num = 8;
        printFactor(num);
    }
}

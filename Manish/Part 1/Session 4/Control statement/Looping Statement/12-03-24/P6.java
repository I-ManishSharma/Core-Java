import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m ");
        int m = sc.nextInt(), product = 1;
        for (int i = 1; i <= m; i++) {
            product *= n;
        }
        System.out.println(product);
        sc.close();
    }
}

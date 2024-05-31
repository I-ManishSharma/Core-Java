public class P6 {
    public static void main(String[] args) {
/*/
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            int j = 1;
            while (j <= 3) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 2);
    }
}

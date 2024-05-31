public class P13 {
    public static void main(String[] args) {
        int count = 9;
        /*
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(count--);
            }
            System.out.println();
        }

        count = 9;
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(count--);
                j++;
            }
            System.out.println();
            i++;
        }
*/
        count = 9;
        int i = 1;
        do {
            int j = 1;
            while (j <= 3) {
                System.out.print(count--);
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

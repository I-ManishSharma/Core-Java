public class P15 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j <= 27; j *= 3) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 3) {
            int j = 3;
            while (j <= 27) {
                System.out.print(j + " ");
                j *= 3;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            int j = 3;
            while (j <= 27) {
                System.out.print(j + " ");
                j *= 3;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

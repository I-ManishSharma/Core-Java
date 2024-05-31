public class P16 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 4) {
                System.out.print(j % 2 + " ");
                j++;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            int j = 1;
            while (j <= 4) {
                System.out.print(j % 2 + " ");
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

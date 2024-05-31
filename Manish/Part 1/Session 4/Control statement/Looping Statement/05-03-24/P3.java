public class P3 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 3; i++) {
            for (int j = 4; j <= 7; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 3) {
            int j = 4;
            while (j <= 7) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            int j = 4;
            while (j <= 7) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

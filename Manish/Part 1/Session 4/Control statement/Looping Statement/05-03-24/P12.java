public class P12 {
    public static void main(String[] args) {
        char ch = 'I';
/*
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(ch--);
            }
            System.out.println();
        }

        ch = 'I';
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(ch--);
                j++;
            }
            System.out.println();
            i++;
        }
*/
        ch = 'I';
        int i = 1;
        do {
            int j = 1;
            while (j <= 3) {
                System.out.print(ch--);
                j++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

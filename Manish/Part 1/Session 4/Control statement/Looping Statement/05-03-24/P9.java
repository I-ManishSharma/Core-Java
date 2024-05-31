public class P9 {
    public static void main(String[] args) {
/*
        for (char ch = 'P'; ch >= 'M'; ch--) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        char ch = 'P';
        while (ch >= 'M') {
            int j = 1;
            while (j <= 3) {
                System.out.print(ch);
                j++;
            }
            System.out.println();
            ch--;
        }
*/
        char ch = 'P';
        do {
            int j = 1;
            while (j <= 3) {
                System.out.print(ch);
                j++;
            }
            System.out.println();
            ch--;
        } while (ch >= 'M');
    }
}

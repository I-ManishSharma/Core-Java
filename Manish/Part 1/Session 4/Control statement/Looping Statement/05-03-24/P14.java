public class P14 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 2; i++) {
            for (char ch = 'A'; ch <= 'E'; ch += 2) {
                System.out.print(ch);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 3) {
            char ch = 'A';
            while (ch <= 'E') {
                System.out.print(ch);
                ch += 2;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            char ch = 'A';
            while (ch <= 'E') {
                System.out.print(ch);
                ch += 2;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

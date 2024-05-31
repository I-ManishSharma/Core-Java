public class P2 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 2; i++) {
            for (char ch = 'C'; ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 2) {
            char ch = 'C';
            while (ch <= 'F') {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            char ch = 'C';
            while (ch <= 'F') {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            i++;
        } while (i <= 2);
    }
}

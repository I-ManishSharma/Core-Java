public class P4 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 3; i++) {
            for (char ch = 'Z'; ch >= 'W'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 3) {
            char ch = 'Z';
            while (ch >= 'W') {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            i++;
        }*/

        int i = 1;
        do {
            char ch = 'Z';
            while (ch >= 'W') {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

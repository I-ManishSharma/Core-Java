public class P1 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 3; i++) {
            for (char ch = 'A'; ch <= 'C'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        
        int i = 1;
        while (i <= 3) {
            char ch = 'A';
            while (ch <= 'C') {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            i++;
        }
*/
        int i = 1;
        do {
            char ch = 'A';
            while (ch <= 'C') {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            i++;
        } while (i <= 3);
    }    
}
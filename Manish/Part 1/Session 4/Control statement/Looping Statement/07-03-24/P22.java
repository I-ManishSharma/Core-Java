public class P22 {
    public static void main(String[] args) {
        char ch = 'M';
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O'
                || ch == 'U' || ch == 'u') {
            System.out.println("Vowel");
        } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid");
        }
    }
}

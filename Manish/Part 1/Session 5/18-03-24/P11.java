public class P11 {
    static void lowerCase(char ch) {
        System.out.println((char)(ch+32));
    }
    static void upperCase(char ch) {
        System.out.println((char)(ch-32));
    }
    public static void main(String[] args) {
        char ch = 'M';
        if (ch >= 'A' && ch <= 'Z') lowerCase(ch); else upperCase(ch);
    }
}

public class UppercaseOrNot {
    public static void main(String[] args) {
        char ch = 'E';
	String str = (ch >= 65 && ch <= 90) ? "Is a UpperCase Char" : "Not a UpperCase Char";
        System.out.println(str);
    }
}

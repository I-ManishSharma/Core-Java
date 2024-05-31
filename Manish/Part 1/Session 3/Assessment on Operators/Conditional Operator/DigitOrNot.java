public class DigitOrNot {
    public static void main(String[] args) {
        char ch = '5';
	String str = (ch >= 48 && ch <= 57) ? "IS a Digit" : "Not a Digit";
        System.out.println(str);
    }
}

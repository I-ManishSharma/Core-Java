public class LowerCaseOrNot {
    public static void main(String[] args) {
        char ch = 'e';
	String str = (ch >= 97 && ch <= 122) ? "Is LowerCase" : "Not LowerCase";
        System.out.println(str);
    }
}

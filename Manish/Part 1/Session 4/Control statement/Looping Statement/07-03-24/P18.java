public class P18 {
    public static void main(String[] args) {
        char ch = '&';
        if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("Entered character is not a special character");
        } else {
            System.out.println("Entered character is a special character");
        }
    }
}
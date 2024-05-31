public class VowelOrNot {
    public static void main(String[] args) {
        char ch = 'E';
	String str = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Is a Vowel" : "Not a Vowel";
        System.out.println(str);
    }    
}
public class P17 {
    public static void main(String[] args) {
        int i = 1, year = 1900;
        while (i <= 2) {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(year+" year is a leap year");
            } else {
                System.out.println(year+" year is not a leap year");
            }
            year = 2000;
            i++;
        }
    }
}

public class P6 {
    public static void add (int a, int b) {
        System.out.println(a+b);
    }
    static void sum (int a, float b) {
        System.out.println(a);
        System.out.println(b);
    }
    static void check (boolean b, float f, double d) {
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }
    static void check2 (int a, int b, float f, double d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }
    static void check3 (int a, long l, float f, double d, char c, String s) {
        System.out.println(a);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
    }
    public static void main(String[] args) {
        add(5,6);
        sum(5,8.5f);
        check(true, 56.5f, 58.98);
        check2(8, 9, 89.8f, 89.4);
        check3(8, 891636854l, 89.58f, 6668.55, 'A', "Arvikk");
    }
}

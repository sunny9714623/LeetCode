package onJava8.com.george.ch18.strings;

public class Immutable {
    public static String upCase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q); // howdy
        String qq = upCase(q);
        System.out.println(qq); // HOWDY
        System.out.println(q); // howdy
    }
}

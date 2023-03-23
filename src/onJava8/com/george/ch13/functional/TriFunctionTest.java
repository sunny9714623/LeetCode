package onJava8.com.george.ch13.functional;

public class TriFunctionTest {
    static int f(int i, long l, double d) {
        return 99;
    }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf = TriFunctionTest::f;
        System.out.println(tf.apply(9, 10l, 11.0));
        tf = (i, l, d) -> 12;
        System.out.println(tf.apply(9, 10l, 11.0));
    }
}

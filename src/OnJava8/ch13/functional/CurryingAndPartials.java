package OnJava8.ch13.functional;

import java.util.function.Function;

public class CurryingAndPartials {
    // 未柯里化：
    static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 柯里化的函数
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        System.out.println(uncurried("hi ", "Ho"));

        Function<String, String> hi = sum.apply("Hi ");
        System.out.println(hi.apply("ho"));

        // 部分应用
        Function<String, String> sumHi = sum.apply("Hup ");
        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));
    }
}

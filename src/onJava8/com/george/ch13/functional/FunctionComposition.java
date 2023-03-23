package onJava8.com.george.ch13.functional;

import java.util.function.Function;

public class FunctionComposition {
    static Function<String, String> f1 = s -> {
        System.out.println(s);
        return s.replace('A', '_');
    },
            f2 = s -> s.substring(3),
            f3 = String::toLowerCase,
    // `compose（f2）` 表示 `f2` 的调用发生在 `f1` 之前。
            f4 = f1.compose(f2).andThen(f3);

    public static void main(String[] args) {
        System.out.println(f4.apply("GO AFTER ALL AMBULANCES"));
    }
}

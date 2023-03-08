package OnJava8.ch13.functional;

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

//@FunctionalInterface
//interface NotFunctional {
//    String goodbye(String arg);
//    String hello(String arg);
//}

// `@FunctionalInterface` 注解是可选的; Java 在 `main()`
// 中把 **Functional** 和 **FunctionalNoAnn** 都当作函数式接口。
public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;

        // Functional fac = fa;
        Functional fl = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
    }
}

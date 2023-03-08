package OnJava8.ch13.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        //  应用于对象引用的 `final` 关键字仅表示不会重新赋值引用。 它并不代表你不能修改对象本身。
        final List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer> l1 = c8.makeFun().get(),
                l2 = c8.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}

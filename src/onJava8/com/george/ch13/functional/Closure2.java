package onJava8.com.george.ch13.functional;

import java.util.function.IntSupplier;

public class Closure2 {
    IntSupplier makeFun(int x) {
        int i = 0;
        return () -> x + i;
    }
}

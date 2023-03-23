package onJava8.com.george.ch13.functional;

import java.util.function.IntSupplier;

public class AnonymousClosure {
    IntSupplier makeFun(int x) {
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }
}

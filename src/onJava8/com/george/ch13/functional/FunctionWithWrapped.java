package onJava8.com.george.ch13.functional;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FunctionWithWrapped {
    public static void main(String[] args) {
        Function<Integer, Double> fid = integer -> (double) integer;
        IntToDoubleFunction fid2 = i -> i;
    }
}

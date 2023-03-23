package onJava8.com.george.ch14.streams;

import static java.util.stream.IntStream.range;

public class Repeat {
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }
}

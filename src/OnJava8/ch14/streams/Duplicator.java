package OnJava8.ch14.streams;

import java.util.stream.Stream;

public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}

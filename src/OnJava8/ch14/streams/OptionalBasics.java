package OnJava8.ch14.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalBasics {
    static void test(Optional<String> optString) {
        if (optString.isPresent())
            System.out.println(optString.get());
        else
            System.out.println("Nothing inside!");
    }

    public static void main(String[] args) {
        test(Optional.of("Epithets"));
        test(Stream.<String>empty().findFirst());
    }
}

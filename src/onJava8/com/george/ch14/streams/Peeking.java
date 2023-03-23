package onJava8.com.george.ch14.streams;

import java.io.IOException;

public class Peeking {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("src/com.example.onjava8/ch14/streams/Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}

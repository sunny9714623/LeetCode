package onJava8.com.george.ch14.streams;

import java.io.IOException;
import java.util.Comparator;

public class SortedComparator {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("src/com.example.onjava8/ch14/streams/Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}

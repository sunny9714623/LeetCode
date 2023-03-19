package OnJava8.ch14.streams;

import java.io.IOException;

public class FileToWordsTest {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}

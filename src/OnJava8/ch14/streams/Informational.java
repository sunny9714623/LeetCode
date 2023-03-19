package OnJava8.ch14.streams;

import java.io.IOException;

public class Informational {
    public static void main(String[] args) throws IOException {
        System.out.println(FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat").count());
        System.out.println(FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat").min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
        System.out.println(FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat").max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
    }
}

package OnJava8.ch14.streams;

import java.io.IOException;
import java.util.ArrayList;

public class SpecialCollector {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = FileToWords.stream("src/OnJava8/ch14/streams/Cheese.dat")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        words.stream().filter(s -> s.equals("cheese")).forEach(System.out::println);
    }
}

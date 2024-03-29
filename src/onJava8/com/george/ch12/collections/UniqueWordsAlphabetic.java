package onJava8.com.george.ch12.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsAlphabetic {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/com.example.com.example.onjava8/ch12/collections/SetOperations.java"));
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String line : lines)
            for (String word : line.split("\\W+"))
                if (word.trim().length() > 0)
                    words.add(word);
        System.out.println(words);
    }
}

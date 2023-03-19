package OnJava8.ch14.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileToWords {
    public static Stream<String> stream(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }
}

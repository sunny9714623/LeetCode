package onJava8.com.george.ch17.files;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamInAndOut {
    public static void main(String[] args) {
        try (
                Stream<String> lines = Files.lines(Paths.get("src/onJava8/com/george/ch17/files/StreamInAndOut.java"));
                PrintWriter outPut = new PrintWriter("StreamInAndOut.txt");
        ) {
            lines.map(String::toUpperCase)
                    .forEachOrdered(outPut::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

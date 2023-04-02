package onJava8.com.george.ch17.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("src/onJava8/com/george/ch17/files/PathInfo.java"))
                .skip(13)
                .findFirst()
                .ifPresent(System.out::println);
    }
}

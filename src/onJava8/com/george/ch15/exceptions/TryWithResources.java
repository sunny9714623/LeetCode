package onJava8.com.george.ch15.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream(new File("src/com.example.onjava8/ch15/exceptions/TryWithResources.java"))) {
            int contents = in.read();
            // Process contents
        } catch (IOException e) {
            // Handler the error
        }
    }
}

package OnJava8.ch15.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MessyExceptions {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream(new File("src/OnJava8/ch15/exceptions/MessyExceptions.java"));
            int contents = in.read();
        } catch (IOException e) {
            // Handler the error
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e){
                    // Handle the close() error
                }
            }
        }
    }
}

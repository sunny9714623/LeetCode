package onJava8.com.george.ch16.validating;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Inverter3 implements StringInverter {
    @Override
    public String invert(String str) {
        if (str.length() > 30)
            throw new RuntimeException("argument too long!");
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result += isUpperCase(c) ?
                    toLowerCase(c) :
                    toUpperCase(c);
        }
        return result;
    }
}

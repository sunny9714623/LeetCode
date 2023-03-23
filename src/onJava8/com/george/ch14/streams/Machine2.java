package onJava8.com.george.ch14.streams;



import onJava8.com.george.ch10_interface.Operations;

import java.util.Arrays;

public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                () -> Operations.show("Bing"),
                () -> Operations.show("crack"),
                () -> Operations.show("Twist"),
                () -> Operations.show("Pop")
        }).forEach(Operations::execute);
    }
}

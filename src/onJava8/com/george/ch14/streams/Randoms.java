package onJava8.com.george.ch14.streams;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(15)
                .sorted()
                .forEach(System.out::println);
    }
}

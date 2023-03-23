package onJava8.com.george.ch14.streams;


import static onJava8.com.george.ch14.streams.Repeat.repeat;

public class Looping {
    static void hi() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }
}

package onJava8.com.george.ch14.streams;


import static onJava8.com.george.ch14.streams.RandInts.rands;

public class SelectElement {
    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(rands().parallel().findAny().getAsInt());
    }
}

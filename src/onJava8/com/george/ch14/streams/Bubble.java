package onJava8.com.george.ch14.streams;

public class Bubble {
    public final int i;

    public Bubble(int n) {
        i = n;
    }

    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}

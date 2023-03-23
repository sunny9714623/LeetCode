package onJava8.com.george.ch16.validating;

import java.util.ArrayList;

// Keeps track of how many of itself are created.
public class CountedList extends ArrayList<String> {
    private static int counter = 0;
    private int id = counter++;

    public CountedList() {
        System.out.println("CounterList #" + id);
    }

    public int getId() {
        return id;
    }
}

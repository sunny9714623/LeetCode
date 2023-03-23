package onJava8.com.george.ch10_interface.interfaces;

import java.util.Random;

public interface RandomDoubles {
    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {
            @Override
            public double next() {
                return RandomDoubles.super.next();
            }
        };
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}

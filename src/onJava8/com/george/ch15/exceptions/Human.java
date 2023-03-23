package onJava8.com.george.ch15.exceptions;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught annoyance");
        }

        // catch the base type
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            // ...
        } //catch (Sneeze s) {
        // ...
        // }
    }
}

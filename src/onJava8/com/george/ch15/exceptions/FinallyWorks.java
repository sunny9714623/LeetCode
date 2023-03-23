package onJava8.com.george.ch15.exceptions;

class ThreeException extends Exception {
}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                // Post-increment is zero first time
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch (Exception e) {
                System.out.println("Three Exception");
            } finally {
                System.out.println("In finally clause");
                if(count == 2) break; // out of "while"
            }
        }
    }
}

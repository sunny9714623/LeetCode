package onJava8.com.george.ch11.innerclasses;

public class Parcel9 {
    // Argument must be final or "effectively final"
    // to use within the anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination tasmania = p.destination("tasmania");
        System.out.println(tasmania.readLabel());
    }
}

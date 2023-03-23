package onJava8.com.george.ch11;


import onJava8.com.george.ch11.innerclasses.Destination;

public class Parcel5 {

    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination tasmania = p.destination("Tasmania");
        System.out.println(tasmania.readLabel());
    }
}

package onJava8.com.george.ch16.validating;

public class LoaderAssertions {
    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        new Loaded().go();
    }

}

class Loaded {
    public void go() {
        assert false : "Loaded.go()";
    }
}

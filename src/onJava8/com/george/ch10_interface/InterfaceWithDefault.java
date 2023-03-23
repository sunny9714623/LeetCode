package onJava8.com.george.ch10_interface;

public interface InterfaceWithDefault {
    void firstMethod();

    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }
}

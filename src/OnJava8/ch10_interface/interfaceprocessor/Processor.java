package OnJava8.ch10_interface.interfaceprocessor;

public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}

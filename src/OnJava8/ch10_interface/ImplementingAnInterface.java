package OnJava8.ch10_interface;

interface Concept {
    void idea1();
    void idea2();
}

public class ImplementingAnInterface implements Concept{
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}

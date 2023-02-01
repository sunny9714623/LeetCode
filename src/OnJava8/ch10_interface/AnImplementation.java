package OnJava8.ch10_interface;

public class AnImplementation implements AnInterface {
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}

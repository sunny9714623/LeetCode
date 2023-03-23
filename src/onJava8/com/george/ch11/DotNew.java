package onJava8.com.george.ch11;

// Creating an inner class directly using .new syntax
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        Inner dni = dn.new Inner();
//        Inner inner = new DotNew.Inner();
    }
}

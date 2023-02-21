package OnJava8.ch11.innerclasses;

// For concrete or abstract classes, inner classes
// produce "multiple implementation inheritance"
// {java innerclasses.MultiImplementation}

class D {
}

abstract class E {
}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

// 如果不需要解决“多重继承”的问题，那么自然可以用别的方式编码，而不需要使用内部类。
// 但如果使用内部类，还可以获得其他一些特性：
public class MultiImplementation {
    static void takesD(D d) {
    }

    static void takesE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

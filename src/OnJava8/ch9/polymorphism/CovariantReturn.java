package OnJava8.ch9.polymorphism;

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}

// 关键区别在于 Java 5 之前的版本强制要求被重写的 process() 方法必须返回 Grain 而不是 Wheat，
// 即使 Wheat 派生自 Grain，因而也应该是一种合法的返回类型。协变返回类型允许返回更具体的 Wheat 类型。
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}

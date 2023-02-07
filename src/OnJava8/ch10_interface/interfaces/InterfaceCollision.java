package OnJava8.ch10_interface.interfaces;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 0;
    }
}

class C4 extends C implements I3{
    @Override
    public int f() {
        return super.f();
    }
}

// 同时，重载方法仅根据返回类型是区分不了的
//class C5 extends C implements I1 {}
//interface I4 extends I1, I3{}

public class InterfaceCollision {
}

package OnJava8.ch10_interface;

interface Jim1 {
    default void jim() {
        System.out.println("Jim1::jim");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2::jim");
    }
}

public class Jim implements Jim1, Jim2{
    @Override
    public void jim() {
        Jim2.super.jim();
    }
    // 当然，你可以重定义 jim() 方法，但是也能像上例中那样使用 super 关键字选择基类实现中的一种。

    public static void main(String[] args) {
        new Jim().jim();
    }
}

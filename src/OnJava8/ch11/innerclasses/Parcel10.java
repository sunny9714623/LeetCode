package OnJava8.ch11.innerclasses;

public class Parcel10 {
    // 注意 destination() 的参数必须是 final 的，因为它们是在匿名类内部使用的
    // （译者注：即使不加 final, Java 8 的编译器也会为我们自动加上 final，以保证数据的一致性）
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;

            // Instance initialization for each object:
            {
                // price += 1;
                cost = Math.round(price);
                cost += 1;
                // 所以对于匿名类而言，实例初始化的实际效果就是构造器。
                // 当然它受到了限制-你不能重载实例初始化方法，所以你仅有一个这样的构造器。
                if (cost > 100)
                    System.out.println("Over budget!");
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    // 匿名内部类与正规的继承相比有些受限，因为匿名内部类既可以扩展类，也可以实现接口，但是不能两者兼备。
    // 而且如果是实现接口，也只能实现一个接口。
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination tasmania = p.destination("Tasmania", 101.395f);
        System.out.println(tasmania.readLabel());
    }
}

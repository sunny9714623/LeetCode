package onJava8.com.george.ch11.innerclasses;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        // Base constructor call :
        return new Wrapping(x) { // [1]
            @Override
            public int value() {
                return super.value() * 47;
            }
        }; // [2]
    }

    // [1] : 将合适的参数传递给基类的构造器。
    // [2]: 在匿名内部类末尾的分号，并不是用来标记此内部类结束的。实际上，它标记的是表达式的结束，
    // 只不过这个表达式正巧包含了匿名内部类罢了。因此，这与别的地方使用的分号是一致的。
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping wrapping = p.wrapping(10);
        System.out.println(wrapping.value());
    }
}

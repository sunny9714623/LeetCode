package onJava8.com.george.ch11;

public class Parcel3 {
    private int ii = 12;

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return String.valueOf(ii);
        }
    }

    // 在拥有外部类对象之前是不可能创建内部类对象的。这是因为内部类对象会暗暗地连接到建它的外部类对象上。
    // 但是，如果你创建的是嵌套类（静态内部类），那么它就不需要对外部类对象的引用。
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents contents = p.new Contents();
        Destination destination = p.new Destination("Tasmania");
        System.out.println(destination.readLabel());
        System.out.println(contents.value());
    }
}

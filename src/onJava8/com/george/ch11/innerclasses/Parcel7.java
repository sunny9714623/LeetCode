package onJava8.com.george.ch11.innerclasses;

public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents contents = p.contents();
        System.out.println(contents.value());
    }
}

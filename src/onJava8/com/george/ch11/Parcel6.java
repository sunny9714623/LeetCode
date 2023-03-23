package onJava8.com.george.ch11;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            // rackingSlip 类被嵌入在 if 语句的作用域内，
            // 这并不是说该类的创建是有条件的，它其实与别的类一起编译过了。
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip() {return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
            System.out.println(s);
        }
    }

    public void track() {internalTracking(true);}

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}

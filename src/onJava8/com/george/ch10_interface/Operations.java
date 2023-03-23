package onJava8.com.george.ch10_interface;

public interface Operations {
    void execute();

    static void runOps(Operations... ops){
        for (Operations op: ops){
            op.execute();
        }
    }

    static void show(String msg){
        System.out.println(msg);
    }
}

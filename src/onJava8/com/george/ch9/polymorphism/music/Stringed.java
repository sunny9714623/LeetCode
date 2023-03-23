package onJava8.com.george.ch9.polymorphism.music;

public class Stringed extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    @Override
    String what() {
        return "Stringed";
    }
    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

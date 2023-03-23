package onJava8.com.george.ch15.exceptions;

// Overridden methods can throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    Inning() throws BaseballException {
    }

    public void event() throws BaseballException {

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    // OK to add new exceptions for constructors, but you
// must deal with the base constructor exceptions:

    public StormyInning() throws BaseballException, RainedOut {

    }

    public StormyInning(String s) throws BaseballException {
    }

//    public void walk() throws PopFoul {
//    } // //Compile error

//    public void event() throws RainedOut {
//    } // // If the method doesn't already exist in the
//// base class, the exception is OK:


    @Override
    public void rainHard() throws RainedOut {

    }

    // You can choose to not throw any exceptions,
// even if the base version does:
    @Override
    public void event() {
    }

    // Overridden methods can throw inherited exceptions:
    @Override
    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        // Strike not thrown in derived version
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}

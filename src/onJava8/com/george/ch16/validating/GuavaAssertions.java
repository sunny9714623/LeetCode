package onJava8.com.george.ch16.validating;

import com.google.common.base.VerifyException;

import static com.google.common.base.Verify.verify;

public class GuavaAssertions {
    public static void main(String[] args) {
        verify(2 + 2 == 4);
        try {
            verify(1 + 2 == 4);
        } catch (VerifyException e) {
            System.out.println(e);
        }

        try {
            verify(1 + 2 == 4, "Bad math");
        } catch(VerifyException e) {
            System.out.println(e.getMessage());
        }
    }
}

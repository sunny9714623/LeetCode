package onJava8.com.george.ch10_interface.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

// 因为你可以以这种方式在已有类中增加新接口，所以这就意味着一个接受接口类型的方法
// 提供了一种让任何类都可以与该方法进行适配的方式。这就是使用接口而不是类的强大之处。
public class AdaptedRandomDoubles implements RandomDoubles, Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.next() + " ");
        }
    }
}

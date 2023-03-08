package OnJava8.ch13.functional;

import java.util.function.BiConsumer;

public class BiConsumerPermutations {
    // 这里使用 `System.out.format()` 来显示。它类似于 `System.out.println()` 但提供了更多的显示选项。
    // 这里，`%f` 表示我将 `n` 作为浮点值给出，`%d` 表示 `n` 是一个整数值。
    // 这其中可以包含空格，输入 `%n` 会换行 — 当然使用传统的 `\n` 也能换行，但 `%n` 是自动跨平台的，这是使用 `format()` 的另一个原因。
    static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d, %f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.format("%d, %f%n", i, d);
    static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d, %d%n", i, l);

    public static void main(String[] args) {
        bicid.accept(47, 11.34);
        bicdi.accept(22.45, 92);
        bicil.accept(1, 11L);
    }
}

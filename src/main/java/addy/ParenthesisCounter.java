package addy;

import java.math.BigInteger;

public class ParenthesisCounter {

    /**
     * Подсчитывает количество правильных скобочных комбинаций для n пар.
     * Используется формула Каталана: C(n) = (2n)! / (n! * (n+1)!)
     */
    public static BigInteger countWellFormedParenthesis(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n должен быть от 0 до 15 включительно");
        }

        return factorial(2 * n)
                .divide(factorial(n).multiply(factorial(n + 1)));
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

package addy;

import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.*;

public class ParenthesisCounterTest {

    @Test
    public void testSmallValues() {
        assertEquals(BigInteger.ONE, ParenthesisCounter.countWellFormedParenthesis(1));
        assertEquals(BigInteger.valueOf(2), ParenthesisCounter.countWellFormedParenthesis(2));
        assertEquals(BigInteger.valueOf(5), ParenthesisCounter.countWellFormedParenthesis(3));
        assertEquals(BigInteger.valueOf(14), ParenthesisCounter.countWellFormedParenthesis(4));
        assertEquals(BigInteger.valueOf(42), ParenthesisCounter.countWellFormedParenthesis(5));
    }

    @Test
    public void testZero() {
        assertEquals(BigInteger.ONE, ParenthesisCounter.countWellFormedParenthesis(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        ParenthesisCounter.countWellFormedParenthesis(-1);
    }

    @Test
    public void testPerformance() {
        long start = System.nanoTime();
        BigInteger result = ParenthesisCounter.countWellFormedParenthesis(15);
        long duration = System.nanoTime() - start;
        System.out.println("n=15 result: " + result + ", duration: " + duration / 1_000_000 + " ms");
        assertTrue(result.compareTo(BigInteger.ZERO) > 0);
    }
}
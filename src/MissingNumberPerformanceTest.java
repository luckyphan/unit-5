import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberPerformanceTest {

    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private int max = 10;
    private MissingNumber mn = new MissingNumber();

    @Test(timeout=100)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.findNumber(missingMax, max);
            mn.findNumber(missingNone, max);
            mn.findNumber(missingSeven, max);
        }
    }

    @Test(timeout=100)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.findNumber2(missingMax);
            mn.findNumber2(missingNone);
            mn.findNumber2(missingSeven);
        }
    }

    @Test(timeout=100)
    public void testMissingNumberSum_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.findNumber3(missingMax);
            mn.findNumber3(missingNone);
            mn.findNumber3(missingSeven);
        }
    }
}
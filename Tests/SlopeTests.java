import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlopeTests {

    @Test
    void SlopeOfALineTest1() {
        String result = SlopeOfALine.slope(-2, 5, -2, -8);
        String expected = "The line defined by the points (-2, 5) and (-2, -8) is a vertical line and the slope is undefined";
        assertEquals(result, expected);
    }

    @Test
    void SlopeOfALineTest2() {
        String result = SlopeOfALine.slope(-4, -2, 3, 9);
        String expected = "The line defined by the points (-4, -2) and (3, 9) has a slope of 1.5714285714285714";
        assertEquals(result, expected);
    }

    @Test
    void SlopeOfALineTest3() {
        String result = SlopeOfALine.slope(5, 7, 9, 4);
        String expected = "The line defined by the points (5, 7) and (9, 4) has a slope of -0.75";
        assertEquals(result, expected);
    }
}

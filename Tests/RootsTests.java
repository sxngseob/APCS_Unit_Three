import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RootsTests {

    @Test
    void DiscrimianantAndRootsRealOne() {
        String result = DiscriminantAndRoots.roots(1, 4, 4);
        String expected = "1x^2 + 4x + 4 has 1 real root";
        assertEquals(result, expected);
    }

    @Test
    void DiscrimianantAndRootsImaginary() {
        String result = DiscriminantAndRoots.roots(4, -2, 1);
        String expected = "4x^2 + -2x + 1 has 2 imaginary roots";
        assertEquals(result, expected);
    }

    @Test
    void DiscrimianantAndRootsTwoReal() {
        String result = DiscriminantAndRoots.roots(2, -1, -3);
        String expected = "2x^2 + -1x + -3 has 2 real roots";
        assertEquals(result, expected);
    }
}

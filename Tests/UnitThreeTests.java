import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UnitThreeTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    @Order(1)
    void FindLargestTest1() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/find_largest1.txt"));
        FindLargest.main(args);
        assertTrue(outContent.toString().contains("-7 and -7 are equal"));
    }

    @Test
    @Order(2)
    void FindLargestTest2() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/find_largest2.txt"));
        FindLargest.main(args);
        assertTrue(outContent.toString().contains("13 is larger than 12"));
    }

    @Test
    @Order(3)
    void FindLargestTest3() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/find_largest3.txt"));
        FindLargest.main(args);
        assertTrue(outContent.toString().contains("4 is larger than -1"));
    }

    @Test
    @Order(4)
    void AddToPositiveOrNegativeSum1() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/pos_neg1.txt"));
        AddToPositiveOrNegativeSum.main(args);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 45\n" +
                "The sum of the negative numbers is 0"));
    }

    @Test
    @Order(5)
    void AddToPositiveOrNegativeSum2() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/pos_neg2.txt"));
        AddToPositiveOrNegativeSum.main(args);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 0\n" +
                "The sum of the negative numbers is -55"));
    }

    @Test
    @Order(6)
    void AddToPositiveOrNegativeSum3() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/pos_neg3.txt"));
        AddToPositiveOrNegativeSum.main(args);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 15\n" +
                "The sum of the negative numbers is -15"));
    }

    @Test
    @Order(7)
    void SlopeOfALineTest1() {
        String result = SlopeOfALine.slope(-2, 5, -2, -8);
        String expected = "The line defined by the points (-2, 5) and (-2, -8) is a vertical line and the slope is undefined";
        assertEquals(result, expected);
    }

    @Test
    @Order(8)
    void SlopeOfALineTest2() {
        String result = SlopeOfALine.slope(-4, -2, 3, 9);
        String expected = "The line defined by the points (-4, -2) and (3, 9) has a slope of 1.5714285714285714";
        assertEquals(result, expected);
    }

//    @Test
//    @Order(9)
//    void DiscrimianantAndRoots0() {
//        String result = DiscriminantAndRoots.roots(1, 4, 4);
//        String expected = "1x^2 + 4x + 4 has 1 real root";
//        assertEquals(result, expected);
//    }

}
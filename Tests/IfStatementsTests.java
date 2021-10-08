import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IfStatementsTests {
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
    void FindLargestTest1() throws IOException {
        System.setIn(new FileInputStream("data_files/find_largest1.txt"));
        FindLargest.main(null);
        assertTrue(outContent.toString().contains("-7 and -7 are equal"));
    }

    @Test
    void FindLargestTest2() throws IOException {
        System.setIn(new FileInputStream("data_files/find_largest2.txt"));
        FindLargest.main(null);
        assertTrue(outContent.toString().contains("13 is larger than 12"));
    }

    @Test
    void FindLargestTest3() throws IOException {
        System.setIn(new FileInputStream("data_files/find_largest3.txt"));
        FindLargest.main(null);
        assertTrue(outContent.toString().contains("4 is larger than -1"));
    }

    @Test
    void AddToPositiveOrNegativeSum1() throws IOException {
        System.setIn(new FileInputStream("data_files/pos_neg1.txt"));
        AddToPositiveOrNegativeSum.main(null);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 45\n" +
                "The sum of the negative numbers is 0"));
    }

    @Test
    void AddToPositiveOrNegativeSum2() throws IOException {
        System.setIn(new FileInputStream("data_files/pos_neg2.txt"));
        AddToPositiveOrNegativeSum.main(null);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 0\n" +
                "The sum of the negative numbers is -55"));
    }

    @Test
    void AddToPositiveOrNegativeSum3() throws IOException {
        System.setIn(new FileInputStream("data_files/pos_neg3.txt"));
        AddToPositiveOrNegativeSum.main(null);
        assertTrue(outContent.toString().contains("The sum of the positive numbers is 15\n" +
                "The sum of the negative numbers is -15"));
    }
}

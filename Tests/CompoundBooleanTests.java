import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CompoundBooleanTests {

    @Test
    public void LoneTeenTests() {
        assertTrue(LoneTeen.loneTeen(0, 15));
        assertTrue(LoneTeen.loneTeen(13, 20));
        assertFalse(LoneTeen.loneTeen(-13, 0));
        assertFalse(LoneTeen.loneTeen(15, 15));
    }

    @Test
    public void SeasonTests() {
//        assertEquals("Spring", Season.season(3, 20));
//        assertEquals("Spring", Season.season(5, 1));
//        assertEquals("Spring", Season.season(6, 19));
//        assertEquals("Summer", Season.season(6, 20));
//        assertEquals("Summer", Season.season(8, 4));
//        assertEquals("Summer", Season.season(9, 21));
//        assertEquals("Fall", Season.season(9, 22));
//        assertEquals("Fall", Season.season(11, 15));
//        assertEquals("Fall", Season.season(12, 20));
//        assertEquals("Winter", Season.season(12, 21));
//        assertEquals("Winter", Season.season(1, 30));
//        assertEquals("Winter", Season.season(3, 19));
//        assertEquals("Invalid Input", Season.season(14, 20));
//        assertEquals("Invalid Input", Season.season(12, 0));
//        assertEquals("Invalid Input", Season.season(-4, 32));
    }
}

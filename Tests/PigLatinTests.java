import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PigLatinTests {

    @Test
    public void consonantsFirst() {
        assertEquals("andysay", PigLatin.makePigLatin("Sandy"));
        assertEquals("ingspray", PigLatin.makePigLatin("Spring"));
        assertEquals("iendsfray", PigLatin.makePigLatin("Friends"));
        assertEquals("oolschay", PigLatin.makePigLatin("School"));
    }

    @Test
    public void vowelsFirst() {
        assertEquals("objectyay", PigLatin.makePigLatin("Object"));
        assertEquals("appleyay", PigLatin.makePigLatin("Apple"));
    }

    @Test
    public void startsWithY() {
        assertEquals("ippeeyay", PigLatin.makePigLatin("Yippee"));
        assertEquals("ahooyay", PigLatin.makePigLatin("Yahoo"));
    }

    @Test
    public void secondLetterY() {
        assertEquals("ybercay", PigLatin.makePigLatin("Cyber"));
        assertEquals("ybridhay", PigLatin.makePigLatin("Hybrid"));
    }

    @Test
    public void yNotFirstOrSecond() {
        assertEquals("yptcray", PigLatin.makePigLatin("Crypt"));
        assertEquals("ylyspray", PigLatin.makePigLatin("Spryly"));
    }
}

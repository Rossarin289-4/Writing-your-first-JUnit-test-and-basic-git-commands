package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShiftCipherTest {

    ShiftCipher cipher = new ShiftCipher();

    @Test
    public void testTC01() {
        String result = cipher.shift("SOFTWARE", 3);
        assertEquals("VRIWZDUH", result);
    }

    @Test
    public void testTC02() {
        String result = cipher.shift("software", 3);
        assertEquals("VRIWZDUH", result);
    }

    @Test
    public void testTC03() {
        String result = cipher.shift("EFgh", 3);
        assertEquals("HIJK", result);
    }

    @Test
    public void testTC04() {
        String result = cipher.shift("ABC123", 3);
        assertEquals("DEF123", result);
    }
}

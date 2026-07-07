package sqa.lab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShiftCipherTest {

    ShiftCipher cipher = new ShiftCipher();

    @Test
    public void testTC01() {
        // Input: SOFTWARE, 3 -> Expected: VRIWZDUH
        String result = cipher.shift("SOFTWARE", 3);
        assertEquals("VRIWZDUH", result);
    }

    @Test
    public void testTC02() {
        // Input: software, 3 -> Expected: VRIWZDUH (แปลงเป็นตัวพิมพ์ใหญ่ก่อน)
        String result = cipher.shift("software", 3);
        assertEquals("VRIWZDUH", result);
    }

    @Test
    public void testTC03() {
        // Input: EFgh, 3 -> Expected: HIJK (แปลงเป็นตัวพิมพ์ใหญ่ก่อน)
        String result = cipher.shift("EFgh", 3);
        assertEquals("HIJK", result);
    }

    @Test
    public void testTC04() {
        // Input: ABC123, 3 -> Expected: DEF123 (ตัวเลขอยู่เหมือนเดิม)
        String result = cipher.shift("ABC123", 3);
        assertEquals("DEF123", result);
    }
}
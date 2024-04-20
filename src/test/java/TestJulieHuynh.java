import org.example.JulieHuynh;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJulieHuynh {

    @Test
    public void testGetFullName() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("Julie Huynh", julie.getFullName());
    }

    @Test
    public void testGetFirstName() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("Julie", julie.getFirstName());
    }

    @Test
    public void testGetLastName() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("Huynh", julie.getLastName());
    }

    @Test
    public void testGetUCInetID() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("julieh16", julie.getUCInetID());
    }

    @Test
    public void testGetStudentNumber() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals(94204014, julie.getStudentNumber());
    }

    @Test
    public void testGetRotatedFullNamePositiveShift() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("lie HuynhJu", julie.getRotatedFullName(2));
    }

    @Test
    public void testGetRotatedFullNameNegativeShift() {
        JulieHuynh julie = new JulieHuynh();
        assertEquals("HuynhJulie ", julie.getRotatedFullName(-5));
    }
}
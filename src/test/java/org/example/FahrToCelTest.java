package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FahrToCelTest {
    @Test
    public void testFahrToCel() {
        assertEquals(0, FahrToCel.fahrToCel(32), 0.01);
        assertEquals(100, FahrToCel.fahrToCel(212), 0.01);
        assertEquals(37, FahrToCel.fahrToCel(98.6f), 0.01);
    }
    @Test
    public void testKelvinToCel() {
        assertEquals(0, FahrToCel.kelvinToCel(273.15f), 0.01);
        assertEquals(100, FahrToCel.kelvinToCel(373.15f), 0.01);
        assertEquals(37, FahrToCel.kelvinToCel(310.15f), 0.01);
    }
}
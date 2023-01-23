package week2.whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    /**
     * Je hebt als doel de volgende functies te testen
     * Maak een nummer aan
     * Controller of de is even functie goed werkt
     * Controleer of de is odd functie werkt
     * Controleer of de is prime werkt
     * Controleer of de is positive werkt
     * Controleer of de is negative werkt
     */
    @Test
    void firstTest() {
        Number number = new Number(0);
        assertEquals(0, number.getNumber());
    }

}

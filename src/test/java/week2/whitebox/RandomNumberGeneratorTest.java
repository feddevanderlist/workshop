package week2.whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static week2.whitebox.RandomNumberGenerator.generateRandomNumber;

class RandomNumberGeneratorTest {

    /**
     * Voor de huidige opdracht wil functie generateRandomNumber testen
     * Begin met testen of je een random getal terug krijgt tussen 0 en 10
     * Vervolgens maak je er tussen 0 en 100 van
     * Ook kun je zonder start getal kijken of dit goed gaat
     */
    @Test
    void testRandomNumberTussen0enX() {
        int randomGetal = generateRandomNumber(10);
        assertTrue(randomGetal > 0);
        assertTrue(randomGetal < 10);
    }

    @Test
    void testGenerateRandomNummerTussenXenY() {
        int randomGetal = generateRandomNumber(1, 2);
    }
}

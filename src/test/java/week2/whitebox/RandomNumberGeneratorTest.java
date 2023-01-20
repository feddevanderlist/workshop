package week2.whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static week2.whitebox.RandomNumberGenerator.generateRandomNumber;

class RandomNumberGeneratorTest {

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
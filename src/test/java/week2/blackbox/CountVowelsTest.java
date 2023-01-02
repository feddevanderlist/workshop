package week2.blackbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsTest {
    CountVowels countVowels = new CountVowels();

    /**
     * De count vowels telt alle klinkers in een stukje tekst
     * Je krijgt een getal terug met het aantal klinkers
     * Denk aan de rand gevallen
     */
    @Test
    void countVowels() {
        int aantal = countVowels.countVowels("");
        assertEquals(0, aantal);
    }

    /**
     * isVowel kijkt of een letter een klinker is en wordt gebruikt in de countvowels functie
     * Test of deze wel helemaal goed werkt
     * Niet spieken in de originele klass :)
     */
    @Test
    void isVowel() {
        char character = 'x';
        boolean xIsVowel = countVowels.isVowel(character);
        assertFalse(xIsVowel);

    }
}
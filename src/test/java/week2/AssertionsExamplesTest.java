package week2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsExamplesTest {

    /**
     * assertTrue zegt dat de variable waar moet zijn
     * Dit kan zijn een boolean of een vergelijking
     * Gebruik dit wanneer je een boolean terug krijgt van een functie
     */
    @Test
    void assertTrueTest() {
        boolean isWaar = true;
        assertTrue(isWaar);

        assertTrue(1 == 1);

        assertTrue("test" == "test");

        assertTrue("test" != "test2");
    }

    /**
     * assertEquals test of de twee variabelen hetzelfde zijn
     * Gebruik dit wanneer je jouw verwachte uitkomst wil vergelijken met de echte uitkomst.
     */
    @Test
    void assertEqualsTest() {
        assertEquals("alfa", "alfa");

        int a = 1;
        int b = 1;
        assertEquals(a, b);

    }

    /**
     * assertTrue maar dan omgekeerd
     * Gebruik dit als wil testen dat 2 waardes niet gelijk zijn
     */
    @Test
    void assertFalseTest() {
        assertFalse(false);
        assertFalse(1 == 2);
    }

    /**
     * Controleert of een variable niet null is
     * Maar de inhoud van een object mag wel null zijn
     * Belangrijke controle om te zien dat de waarde die je terug krijgt niet "leeg" (null) is
     */
    @Test
    void assertNotNullTest() {
        assertNotNull("test");
        assertNotNull(2);
        assertNotNull(0);

        Object object = new Object();
        assertNotNull(object);
    }

    /**
     * Test het omgekeerde van de assert not null
     * In dit geval heb ik een variable gemaakt, maar met null gevuld en dan is je antwoord null
     * Dit zal je weinig gebruiken maar vooral om te valideren dat in de start van je test iets niet bestaat
     */
    @Test
    void assertNullTest() {
        assertNull(null);
        Object testObject = null;
        assertNull(testObject);
    }

    /**
     * Test of objecten hetzelfde zijn.
     * Dus objectC en objectD zijn in dit geval exact hetzelfde object
     * Om te controleren of 2 objecten hetzelfde zijn.
     * Denk aan een gebruiker in een database als je deze vergelijkt
     */
    @Test
    void assertSameTest() {
        int a = 1;
        int b = 1;
        assertSame(a, b);

        Object objectC = new Object();
        Object objectD = objectC;
        assertSame(objectC, objectD);
    }

    /**
     * Test het omgekeerde van de vorige test.
     * De objecten zijn uniek
     * Denk aan het bekijken of een gebruiker of iets anders niet al bestaat
     */
    @Test
    void assertNotSameTest() {
        int a = 1;
        int b = 2;
        assertNotSame(a, b);

        Object objectA = new Object();
        Object objectB = new Object();
        assertNotSame(objectB, objectA);
    }

    /**
     * Test of de inhoud van een array, lijst of een set exact hetzelfde zijn
     * Dus 2 unieke lijstjes met dezelfde inhoud
     * Als je een lijstje met waardes terug verwacht. Denk aan een lijst met boeken of forum posts
     */
    @Test
    void assertArrayEqualsTest() {
        int[] a = {1, 2};
        int[] b = {1, 2};
        assertArrayEquals(a, b);
    }

    /**
     * Sommige functies kunnen in een foute situatie een error gooien
     * Om dit toch te kunnen testen is er een test om dit te doen
     * In dit geval proberen we een item uit een lege lijst te halen
     * En dit kan niet
     * Ook kun je een message meegeven in het geval dat je ook nog wil testen voor de juiste foutmeldingstekst
     */
    @Test
    void assertThrowsTest() {
        List<Integer> testLijst = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, new Executable() { // op deze regel zet je de exceptie die je verwacht (je mag it uitproberen zodat je de juiste fout hebt
            @Override
            public void execute() {
                Integer test = testLijst.get(1);
                assertNull(test);
            }
        }, "");
    }
}

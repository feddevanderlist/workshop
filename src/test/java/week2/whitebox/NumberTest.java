package week2.whitebox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void firstTest() {
        Number number = new Number(0);
        assertEquals(0, number.getNumber());
    }

}
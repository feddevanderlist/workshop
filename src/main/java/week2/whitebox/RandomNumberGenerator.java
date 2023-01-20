package week2.whitebox;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    /**
     *
     * @param start
     * Start wordt gebruik als start getal en wordt meegenomen in de functie
     * @param end
     * Het eind getal wordt niet mee genomen. Dit houdt in dat als je 10 invult je tot en met 9 als uitkomst kan krijgen
     */
    public static int generateRandomNumber(final int start, final int end) {
        return ThreadLocalRandom.current().nextInt(start, end);
    }

    /**
     *
     * @param end
     * Het eind getal wordt niet mee genomen. Dit houdt in dat als je 10 invult je tot en met 9 als uitkomst kan krijgen
     * @return int
     */
    public static int generateRandomNumber(final int end) {
        return ThreadLocalRandom.current().nextInt(end);
    }
}

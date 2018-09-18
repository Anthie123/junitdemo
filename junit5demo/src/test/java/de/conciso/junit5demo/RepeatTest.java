package de.conciso.junit5demo;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatTest {

    @RepeatedTest(value = 5, name = "{currentRepetition} von {totalRepetitions}")
    public void testRepeatedRandomTest() {
        Double value = new Random().nextDouble();

        assertTrue(value >= 0d);
    }
}

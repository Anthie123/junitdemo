package de.conciso.junit4demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

// Variante 2
//@RunWith(Parameterized.class)
//public class ParameterizedTest {
//    private final int number;
//    private final int result;
//
//    @Parameterized.Parameters(name = "{index}: {0}^2 = {1}")
//    public static Collection<Object[]> testData() {
//        return Arrays.asList(new Object[][]{
//                {1, 1}, {2, 4}, {3, 9}, {4, 16}
//        });
//    }
//
//    public ParameterizedTest(int number, int result) {
//        this.number = number;
//        this.result = result;
//    }
//
//    @Test
//    public void testPowerOf() {
//        assertEquals(result, number * number);
//    }
//}

// Variante 2
@RunWith(Parameterized.class)
public class ParameterizedTest {
    @Parameterized.Parameter
    public int number;
    @Parameterized.Parameter(1)
    public int result;

    @Parameterized.Parameters(name = "{index}: {0}^2 = {1}")
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {1, 1}, {2, 4}, {3, 9}, {4, 16}
        });
    }

    @Test
    public void testPowerOf() {
        assertEquals(result, number * number);
    }
}

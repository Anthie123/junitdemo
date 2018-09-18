package de.conciso.junit5demo;

import de.conciso.junit5demo.util.StringToDoubleConverter;
import de.conciso.junit5demo.util.TestCase;
import de.conciso.junit5demo.util.TestCaseAggregator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void test(final int value) {
        assertDoesNotThrow(() -> Integer.valueOf(value));
    }

    @ParameterizedTest
    @MethodSource("intProvider")
    public void testPowerOf2WithMethodSource(final int value, final int expected) {
        assertEquals(expected, value * value);
    }

    static Stream<Arguments> intProvider() {
        return Stream.of(
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 4),
                Arguments.arguments(3, 9),
                Arguments.arguments(4, 16)
        );
    }

    @DisplayName("Test von Quadratzahlen")
    @ParameterizedTest(name = "{index}: {0}^2={1}")
    @CsvSource({"1, 1", "2, 4", "3, 9", "4, 16"})
    public void testPowerOf2WithCsvSource(final int value, final int expected) {
        assertEquals(expected, value * value);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2345", "2,3456"})
    void testWithExplicitArgumentConversion(@ConvertWith(StringToDoubleConverter.class) Double value) {

        assertNotNull(value);
    }

    @ParameterizedTest(name = "String: {0}, int: {1}")
    @CsvSource({"Test, 1", "Test, 2"})
    public void testWithArgumentsccessor(ArgumentsAccessor arguments) {
        assertEquals("Test", arguments.getString(0));
        assertDoesNotThrow(() -> Integer.valueOf(arguments.getInteger(1)));
    }

    @ParameterizedTest(name = "Arguments: {0}, {1}")
    @CsvSource({"Test, 1", "Test, 2"})
    public void testWithArgumentsAggregator(@AggregateWith(TestCaseAggregator.class) TestCase test) {
        assertEquals("Test", test.getName());
        assertDoesNotThrow(() -> Integer.valueOf(test.getNumber()));
    }
}

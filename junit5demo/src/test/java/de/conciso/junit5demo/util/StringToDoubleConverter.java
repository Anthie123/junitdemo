package de.conciso.junit5demo.util;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringToDoubleConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) {
        assertEquals(Double.class, targetType, "Can only convert German Double");

        NumberFormat format = NumberFormat.getInstance(Locale.GERMANY);
        Double value = null;
        try {
            value = format.parse((String) source).doubleValue();
        } catch (ParseException e) {
            fail("Could not parse string");
        }
        return value;
    }
}

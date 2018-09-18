package de.conciso.junit5demo;

import de.conciso.junit5demo.util.CallbackExtension;
import de.conciso.junit5demo.util.MyTest;
import de.conciso.junit5demo.util.MyTestParameterExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(CallbackExtension.class)
@ExtendWith(MyTestParameterExtension.class)
public class ExtensionDemoTest {
    @Test
    public void testCallbackExtension() {
        assertTrue(true);
    }

    @Test
    public void testMyTestExtension(@MyTest String value) {
        assertEquals("MyTest", value);
    }
}

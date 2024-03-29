package de.conciso.junit5demo.util;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Tag("fast")
@Test
public @interface FastTest {

}

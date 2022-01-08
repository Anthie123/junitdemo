package de.conciso.junit5demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Auch bei verschachtelten Testfällen")
public class NestedTest {

    Object cut_;

    @DisplayName("mit nicht initialisiertem Object")
    @Test
    public void testEmptyObject() {
        assertNull(cut_);
    }

    @DisplayName("wenn man es nicht setzt")
    @Nested
    class NullObject {
        @DisplayName("ist es nicht gesetzt")
        @Test
        public void testEmptyObjectAgain() {
            assertNull(cut_);
        }

        @DisplayName("ist es immer noch nicht gesetzt")
        @Test
        public void testEmptyObjectAgain2() {
            assertNull(cut_);
        }
    }

    @DisplayName("Wenn es gesetzt ist")
    @Nested
    class TheObject{

        @BeforeEach
        public void setObject() {
            cut_ = new Object();
        }

        @DisplayName("ist es gesetzt")
        @Test
        public void testObjectIsNotNull() {
            assertNotNull(cut_);
        }
    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class Display_Generator_Test {
    	@Test
    	void changes_method_name_presentation() {
    		assertTrue(true);
    	}
    }
    @Nested
    @IndicativeSentencesGeneration(separator = " -> ", generator =  DisplayNameGenerator.ReplaceUnderscores.class)
    class Display_Generator_Test_With_Sentence {
    	@Test
    	void changes_method_name_presentation() {
    		assertTrue(true);
    	}
    }


}

package org.jordan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SummationProcessorTest {

    @Test
    void itSumsNumbersCorrectly() {
        SummationProcessor processor = new SummationProcessor(Arrays.asList(10, 23, 58, 5, 6, 0));

        assertEquals(102, processor.process());
    }

}
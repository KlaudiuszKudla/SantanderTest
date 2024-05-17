package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {


    @Test
    public void testSilniaForZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.silnia(0));
    }

    @Test
    public void testSilniaForPositiveNumber() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.silnia(5));
    }

    @Test
    public void testSilniaForNegativeNumber() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> factorial.silnia(-5));
    }
}
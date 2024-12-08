package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testMaximumUsingForLoop() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, calculator.maximumUsingForLoop(arr));
    }

    @Test
    void testMinimumUsingForLoop() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, calculator.minimumUsingForLoop(arr));
    }

    @Test
    void testSumUsingForLoop() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, calculator.sumUsingForLoop(arr));
    }

    @Test
    void testAverageUsingForLoop() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, calculator.averageUsingForLoop(arr));
    }

    @Test
    void testMaximumUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, calculator.maximumUsingStream(arr));
    }

    @Test
    void testMinimumUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, calculator.minimumUsingStream(arr));
    }

    @Test
    void testSumUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, calculator.sumUsingStream(arr));
    }

    @Test
    void testAverageUsingStream() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, calculator.averageUsingStream(arr));
    }

    @Test
    void testEmptyArrayForStreamMethods() {
        int[] emptyArr = {};
        assertThrows(IllegalArgumentException.class, () -> calculator.maximumUsingStream(emptyArr));
        assertThrows(IllegalArgumentException.class, () -> calculator.minimumUsingStream(emptyArr));
        assertThrows(IllegalArgumentException.class, () -> calculator.averageUsingStream(emptyArr));
    }
}

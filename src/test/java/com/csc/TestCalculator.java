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

    @Test
    void testFilterEvens() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, calculator.filterEvens(input));
    }

    @Test
    void testFilterOdds() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, calculator.filterOdds(input));
    }

    @Test
    void testAddFive() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {6, 7, 8, 9, 10};
        assertArrayEquals(expected, calculator.addFive(input));
    }

    @Test
    void testSquareNumbers() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        assertArrayEquals(expected, calculator.squareNumbers(input));
    }
}

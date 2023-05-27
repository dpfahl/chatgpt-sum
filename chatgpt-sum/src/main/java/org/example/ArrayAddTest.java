package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAddTest {

    @Test
    void testSumArrayElements5Pos() {
        int[] arr = {2, 4, 6, 8, 10};
        int expectedSum = 30;
        int actualSum = ArrayAdd.sumArrayElements(arr);
        assertEquals(expectedSum, actualSum);
    }
    @Test
    void testSumArrayElements3Neg() {
        int[] arr = {-2, -4, -10};
        int expectedSum = -16;
        int actualSum = ArrayAdd.sumArrayElements(arr);
        assertEquals(expectedSum, actualSum);
    }
}

package org.example.functions;

import org.example.exceptions.EmptyArrayException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayManipulatorTest {

    @Test
    void testQuickSort() throws EmptyArrayException {
        int[] array = {3, 6, 1, 8, 2};
        ArrayManipulator manipulator = new ArrayManipulator();
        manipulator.quickSort(array, 0, array.length - 1);
        int[] expected = {1, 2, 3, 6, 8};
        assertArrayEquals(expected, array);
    }

    @Test
    void testQuickSortWithEmptyArray() {
        int[] emptyArray = {};
        ArrayManipulator manipulator = new ArrayManipulator();
        assertThrows(EmptyArrayException.class, () -> {
            manipulator.quickSort(emptyArray, 0, emptyArray.length - 1);
        });
    }

    @Test
    void testRemoveDuplicates() throws EmptyArrayException {
        int[] inputArray = {1, 2, 3, 1, 4, 2};
        ArrayManipulator manipulator = new ArrayManipulator();
        int[] result = manipulator.removeDuplicates(inputArray);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRemoveDuplicatesEmptyArray() throws EmptyArrayException {
        int[] emptyArray = {};
        ArrayManipulator manipulator = new ArrayManipulator();
        assertThrows(EmptyArrayException.class, () -> {
            manipulator.removeDuplicates(emptyArray);
        });
    }

    @Test
    void testArrayToList() throws EmptyArrayException {
        int[] inputArray = {1, 2, 3};
        ArrayManipulator manipulator = new ArrayManipulator();
        List<Integer> result = manipulator.arrayToList(inputArray);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testArrayToListThrowsExceptionForEmptyArray() {
        ArrayManipulator manipulator = new ArrayManipulator();
        int[] emptyArray = {};
        assertThrows(EmptyArrayException.class, () -> manipulator.arrayToList(emptyArray));
    }

    @Test
    void testAddNumbersToArray() throws EmptyArrayException {
        int[] array = {1, 2, 3};
        ArrayManipulator manipulator = new ArrayManipulator();
        int[] result = manipulator.addNumbersToArray(array);
        int[] expected = {1, 2, 3, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200};
        assertArrayEquals(expected, result);
    }





}
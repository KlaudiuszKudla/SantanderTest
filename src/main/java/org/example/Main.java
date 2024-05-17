package org.example;

import org.example.exceptions.EmptyArrayException;
import org.example.functions.ArrayManipulator;

public class Main {
    public static void main(String[] args) throws EmptyArrayException {
        int[] testArray = {1,5,9,0,22,98,16,1,5,100,101,0};
//        int[] testArray = {};
        ArrayManipulator arrayManipulator = new ArrayManipulator();
        arrayManipulator.quickSort(testArray, 0, testArray.length - 1);
        var resultArray = arrayManipulator.removeDuplicates(testArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
        var nextResult = arrayManipulator.addNumbersToArray(resultArray);
        for (int i = 0; i < nextResult.length; i++) {
            System.out.println(nextResult[i]);
        }

    }
}
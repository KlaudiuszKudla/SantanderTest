package org.example.functions;

import org.example.exceptions.EmptyArrayException;

import java.util.ArrayList;
import java.util.List;

public class ArrayManipulator {


    public void quickSort(int[] array, int left, int right) throws EmptyArrayException {
        if (array.length == 0){
            throw new EmptyArrayException();
        }
        if(right <= left) return;

        int pivot = partition(array, left, right);
        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
    }

    public int[] removeDuplicates(int[] inputArray) throws EmptyArrayException {
        if (inputArray.length == 0) {
            throw new EmptyArrayException();
        }

        int[] tempArray = createTempArray(inputArray);
        int j = fillTempArray(inputArray, tempArray);

        return createResultArray(tempArray, j);
    }

    public List<Integer> arrayToList(int[] inputArray) throws EmptyArrayException {
        if (inputArray.length == 0) {
            throw new EmptyArrayException();
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            list.add(inputArray[i]);
        }
        return list;
    }


    public int[] addNumbersToArray(int[] array) throws EmptyArrayException {
        List<Integer> list = arrayToList(array);
        for (int i = 100; i <= 200; i++) {
            list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    private int[] createTempArray(int[] inputArray) {
        return new int[inputArray.length];
    }

    private int fillTempArray(int[] inputArray, int[] tempArray) {
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (!isDuplicate(inputArray[i], tempArray, j)) {
                tempArray[j++] = inputArray[i];
            }
        }
        return j;
    }

    private boolean isDuplicate(int value, int[] array, int length) {
        for (int k = 0; k < length; k++) {
            if (value == array[k]) {
                return true;
            }
        }
        return false;
    }

    private int[] createResultArray(int[] tempArray, int length) {
        int[] resultArray = new int[length];
        System.arraycopy(tempArray, 0, resultArray, 0, length);
        return resultArray;
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }


}

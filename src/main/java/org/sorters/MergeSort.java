package org.sorters;

public class MergeSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length <= 1) {
            return arrayToSort;
        }
        int midPoint = arrayToSort.length / 2;
        int[] left = new int[midPoint];
        int[] right = new int[midPoint];

        if (arrayToSort.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }
        for (int i = 0; i < midPoint; i++) {
            left[i] = arrayToSort[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arrayToSort[midPoint + j];
        }
        int[] result = new int[arrayToSort.length];
        left = sortArray(left);
        right = sortArray(right);
        result = merge(left, right);
        return result;
        // return new int[0];
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultpointer;
        leftPointer = rightPointer = resultpointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultpointer++] = left[leftPointer++];
                } else {
                    result[resultpointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultpointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultpointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}

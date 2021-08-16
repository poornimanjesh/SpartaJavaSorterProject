package org.sorters;

public class SelectionSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int i, j, lowValue, lowindex, temp = 0;
        for (i = 0; i < arrayToSort.length; i++) {
            lowValue = arrayToSort[i];
            lowindex = i;
            for (j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < lowValue) {
                    lowValue = arrayToSort[j];
                    lowindex = j;
                }
            }
            if (lowValue < arrayToSort[i]) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[lowindex];
                arrayToSort[lowindex] = temp;
            }
        }
        return arrayToSort;
        //return new int[0];
    }
}

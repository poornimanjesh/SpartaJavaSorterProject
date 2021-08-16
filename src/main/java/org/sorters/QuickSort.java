package org.sorters;

public class QuickSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {

            quickSort(arrayToSort, 0, arrayToSort.length - 1);
        }

        return arrayToSort;
    }

    private void quickSort(int[] array, int lowNum, int highnum) {
        if (lowNum > highnum) return;
        int mid = lowNum + (highnum - lowNum) / 2;
        int pivot = array[mid];
        int i = lowNum;
        int j = highnum;
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (lowNum < j)
            quickSort(array, lowNum, j);
        if (highnum > i)
            quickSort(array, i, highnum);
    }
}

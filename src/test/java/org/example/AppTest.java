package org.example;
import org.junit.Assert;
import org.junit.Test;
import org.sorters.*;


public class AppTest {

    int[] arrayToSort = {33,5,66,8,999,23};
    int[] resExpected = {5,8,23,33,66,999};


    @Test
    public void bubbleSortAlgorithmShouldSort()
    {
        Sorter bsObj = new BubbleSort();
        int[] actualRes = bsObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }
    @Test
    public void binaryTreeSortAlgorithmShouldSort()
    {
        Sorter bnObj = new BinaryTreeSort();
        int[] actualRes = bnObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }

    @Test
    public void insertionSortAlgorithmShouldSort()
    {
        Sorter inObj = new InsertionSort();
        int[] actualRes = inObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }
    @Test
    public void mergeSortAlgorithmShouldSort()
    {
        Sorter mgObj = new MergeSort();
        int[] actualRes = mgObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }
    @Test
    public void quickSortAlgorithmShouldSort()
    {
        Sorter quObj = new QuickSort();
        int[] actualRes = quObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }
    @Test
    public void selectionSortAlgorithmShouldSort()
    {
        Sorter seObj = new SelectionSort();
        int[] actualRes = seObj.sortArray(arrayToSort);
        Assert.assertArrayEquals(resExpected,actualRes);

    }
}

package org.starters;

import org.sorters.*;

public class SortFactory {
    public Sorter getSorter(String sorterType){
        if(sorterType == null){
            return null;
        }
        if(sorterType.equalsIgnoreCase("MergeSort")){
            return new MergeSort();

        } else if(sorterType.equalsIgnoreCase("BubbleSort")){
            return new BubbleSort();

        } else if(sorterType.equalsIgnoreCase("InsertionSort")){
            return new InsertionSort();
        }
        else if(sorterType.equalsIgnoreCase("QuickSort")){
            return new QuickSort();
        }
        else if(sorterType.equalsIgnoreCase("SelectionSort")){
            return new SelectionSort();
        }
        else if(sorterType.equalsIgnoreCase("BinaryTreeSort")){
            return new BinaryTreeSort();
        }

        return null;
    }
}

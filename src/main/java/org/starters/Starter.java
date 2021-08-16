package org.starters;


import org.sorters.*;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Starter extends Utility {

    public static void main(String[] args) throws InterruptedException {


        printTypesOfarray();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the type of array");
        String algo = myObj.nextLine();  // Read user input
        SortFactory sortFactory = new SortFactory();
        Sorter sorter = sortFactory.getSorter(algo);
        System.out.println("Enter Size of the Array: ");
        String arraySize = myObj.nextLine();  // Read user input
        Integer size = parseInt(arraySize);
        int[] sortedArray;
        System.out.println("Algorithm used:"+ algo);
        double start = System.nanoTime();
        System.out.println("start time:"+start);

        sortedArray = sorter.sortArray(randomNumGen(size));


        System.out.println("After sort:");
        printArray(sortedArray);
        double end = System.nanoTime();
        double totaltime = end-start;
        System.out.println("Total time taken: "+ totaltime/1000000+ " nano seconds");

    }
}


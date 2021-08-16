package org.sorters;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.starters.Starter;

import java.util.Random;

public class Utility {
    public static void printArray(int arry[]) {

        for (int i : arry) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static int[] randomNumGen(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 100);

        }

        System.out.println("Before sorting");
        printArray(arr);
        return arr;
    }

    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void logging() {

        BasicConfigurator.configure();

    }

    public static void printTypesOfarray() {
        System.out.println("Avilable sorting Algorithm ");
        System.out.println("QuickSort");
        System.out.println("Mergesort");
        System.out.println("Insertionsort");
        System.out.println("Selectionsort");
        System.out.println("Bubblesort");
        System.out.println("BinaryTreesort");
        System.out.println(" ");

    }
}
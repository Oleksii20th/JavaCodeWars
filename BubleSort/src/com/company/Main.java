package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int table[] = {7,4,5,9,3,2,4,11,1};
        System.out.println("Table before sorting:");
        System.out.println(Arrays.toString(table));
        bubbleSort.sort.NumberSort(table);
        System.out.println("Table after sorting: ");
        bubbleSort.print(table);
    }
}

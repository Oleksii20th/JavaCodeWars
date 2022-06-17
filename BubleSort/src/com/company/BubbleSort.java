package com.company;

public class BubbleSort {
    void print(int array[]){
        int numberOfTable = array.length;
        for (int i = 0; i < numberOfTable; i++){
            System.out.print(array[i] + " ");

        }
    }

    Sort sort = new Sort() {
        @Override
        public void NumberSort(int[] table) {
            if(table.length == 0){
                throw new NullPointerException("Table cann't Be equal 0");
            }
            if(table.length == 0){
                throw new IllegalArgumentException("The table must have 1 value");
            }
            int numberOfTable = table.length;

            for(int i = 0; i < numberOfTable - 1; i++)
                for(int j = 0 ; j < numberOfTable - i - 1; j++)
                    if(table[j] > table[j+1]){
                        int temp = table[j];
                        table[j] = table[j+1];
                        table[j+1] = temp;
                    }
        }
    };
}

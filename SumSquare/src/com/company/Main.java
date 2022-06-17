package com.company;

public class Main {
    //Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//        For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
    public static void main(String[] args) {
        int n[] = new int[]{1,2,3};
        System.out.println(calculateSquare(n));
    }
    public static int calculateSquare(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i * i;
        }
        return sum;
    }
}

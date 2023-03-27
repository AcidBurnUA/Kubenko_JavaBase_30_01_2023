package com.homeworks18;

public class ArrayOperations {
    public static double average(int[] average) {
        double sum = 0;
        for (int i = 0; i < average.length; i++) {
            sum += average[i];
        }
        return sum / average.length;
    }
}

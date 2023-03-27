package com.homeworks18;
import com.homeworks18.ArrayOperations;
import com.homeworks18.Matrix;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TestMain {
    @Test
    void main() {
        int[] arr = {1, 10000};
        double avg = ArrayOperations.average(arr);
        System.out.println("Average: " + avg);
    }
    @Test
    void main2 (){
        int[][] matrix = new int[3][3];
        boolean isSquare2 = Matrix.isSquareMatrix(matrix);
        System.out.println("Is square? " + isSquare2);
    }
}
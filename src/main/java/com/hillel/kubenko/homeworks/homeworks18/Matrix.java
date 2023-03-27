package com.hillel.kubenko.homeworks.homeworks18;

public class Matrix {
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix is null or empty.");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        return (rows == cols);
    }
}
package com.practice.programming;

public class MatrixMultiplication {

    public static int[][] addMatrix(int[][] a, int[][] b) {

        int n = a.length;
        int m = b.length;

        int[][] c = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                c[i][j] = 0;

                for (int k = 0; k < n; k++) {

                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);

                }

            }
        }

        return c;
    }

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};

        int[][] c = addMatrix(a, b);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                System.out.println(c[i][j]);

            }
        }
    }
}

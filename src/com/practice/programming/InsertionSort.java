package com.practice.programming;

public class InsertionSort {

    public static void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int key = a[i];

            int j = i - 1;

            while (j >= 0 && a[j] > key) {

                a[j+1] = a[j];
                j--;

            }

            a[j+1] = key;
        }


    }

    public static void main(String[] args) {
        int[] a = {2, 1, 7, 5, 4, 3, 6, -1, 0};

        sort(a);

        for (int i : a) {
            System.out.println(i);
        }

    }
}

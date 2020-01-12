package com.practice.programming;

import java.util.Arrays;

public class SelectionSort {


    public static void sort(int[] a) {

        // find minimum, move to the beginning of the array, do this n time

        // to find minimum, take a min variable, iterate over array if any element is less than min, then

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                if (a[j] <= min) {

                    min = a[j];
                    minIndex = j;

                }

            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            min = Integer.MAX_VALUE;

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

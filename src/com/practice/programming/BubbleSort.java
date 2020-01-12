package com.practice.programming;

public class BubbleSort {

    public static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length-1; j++) {

                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
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

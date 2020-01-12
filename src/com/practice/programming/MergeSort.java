package com.practice.programming;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2, 1, 7, 5, 4, 3, 6, -1, 0};

        new MergeSort().sort(a, 0, a.length - 1);

        for (int i : a) {
            System.out.println(i);
        }

    }

    public void sort(int[] a, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);

        }
    }

    public void merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = 0;

        if (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        if (i < n1) {

            arr[k] = left[i];
            i++;
            k++;

        }

        if (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }


    }


}

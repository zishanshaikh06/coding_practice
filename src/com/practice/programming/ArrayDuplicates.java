package com.practice.programming;

public class ArrayDuplicates {

    int[] num = {0, 0, 1, 1, 2, 3, 3, 3, 4, 5, 6};

    public static int removeDuplicateElements(int[] arr) {

        int n = arr.length;

        if (n == 0 || n == 1) {
            return n;
        }

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50, 60, 60, 60};
        int length = arr.length;
        length = removeDuplicateElements(arr);
        //printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }

}

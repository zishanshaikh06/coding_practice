package com.practice.programming;

public class ArrayRotationByK {

    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(num, k);

        for (int i : num) {
            System.out.print(i + " ");
        }


    }

}

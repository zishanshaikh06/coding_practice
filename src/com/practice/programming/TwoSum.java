package com.practice.programming;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] retArr = new int[2];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int searchNum = target - nums[i];

            int index = binarySearch(nums, searchNum);

            if ((nums[i] + searchNum) == target) {
                retArr[0] = i;
                retArr[1] = index;

                return  retArr;

            }

        }


        return retArr;
    }

    public static int binarySearch(int[] nums, int num) {

        int low = 0;

        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + (high - 1)) / 2;

            if (nums[mid] == num) {
                return mid;
            } else if (num < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        for (int i = low; i < high; i++) {


        }


        return -1;


    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 11, 13};
        int target = 9;

        int[] indices = twoSum(arr, target);

        for (int index : indices) {
            System.out.println(index);
        }

    }


}

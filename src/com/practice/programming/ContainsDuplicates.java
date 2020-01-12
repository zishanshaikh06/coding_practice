package com.practice.programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) return true;

            set.add(num);
        }

        return false;

    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,3,4,4,5,5,5,6,6};

        System.out.println("Contains duplicates: "+containsDuplicate(nums));

    }

}

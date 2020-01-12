package com.practice.programming;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                ++zeroCount;
            } else {
                list.add(num);
            }
        }

        while(zeroCount>0){
            list.add(0);
            --zeroCount;
        }

        for (int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }

        System.out.println(list);


    }

    public static void main(String[] args) {

        int[] input = {0, 1, 0, 3, 12};

        moveZeroes(input);

    }

}

package com.practice.programming;

import java.util.*;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        System.out.println(intersection(arr1, arr2).toString());

    }

    public static int[] intersection(int[] arr1, int[] arr2){

        List<Integer> list = new ArrayList<>();

        List<Integer> intersection = new ArrayList<>();


        for (int i : arr1) {
            list.add(i);
        }

        for (int i : arr2) {
            if(list.contains(i)){
                intersection.add(list.get(list.indexOf(i)));
            }
        }

        Set<Integer> finalSet = new LinkedHashSet<>();

        for(int j: arr1){
            if(intersection.contains(j)){
                finalSet.add(j);
            }
        }

        return finalSet.stream().mapToInt(Integer::intValue).toArray();

    }

}

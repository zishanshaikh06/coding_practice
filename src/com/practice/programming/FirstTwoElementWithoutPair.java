package com.practice.programming;

import java.util.*;

public class FirstTwoElementWithoutPair {

    public static List<Integer> getFirstTwoItemsWithoutPair(List<Integer> list) {

        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> order = new HashMap<>();

        int ord =0;
        for (Integer integer : list) {
            order.put(integer, ord++);
        }

        Collections.sort(list);



        Map<Integer, Integer> map = new LinkedHashMap();

        for (Integer n : list) {

            if (map.containsKey(n)) {

                int num = map.get(n);
                map.put(n, ++num);

            } else {
                map.put(n, 1);
            }


        }


        Iterator<Integer> itr = map.keySet().iterator();

        int nonDupCount = 0;

        while (itr.hasNext()){

            Integer key = itr.next();

            if(map.get(key) == 1 && nonDupCount<=2){
                res.add(key);
                nonDupCount++;
            }



        }

        Iterator<Integer> itr1 = order.keySet().iterator();

        List<Integer> finalList = new ArrayList<>();

        while (itr1.hasNext()){

            Integer key = itr1.next();

            if(res.contains(key)){
                finalList.add(key);
            }



        }


        return finalList;


    }

    public static void main(String[] args) {
        System.out.println(getFirstTwoItemsWithoutPair(Arrays.asList(8, 5,23,23,66,5,23,7, 8)));
    }
}

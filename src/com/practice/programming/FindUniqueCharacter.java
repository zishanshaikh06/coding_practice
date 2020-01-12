package com.practice.programming;

import java.util.*;

public class FindUniqueCharacter {

    public static int firstUniqChar(String s) {

        int ret = -1;

        if(s == null || s.length()<=0){
            return ret;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        char unique = 0;

        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), 1 + (map.get(s.charAt(i))!=null?map.get(s.charAt(i)):0));

        }

        Iterator<Character> itr = map.keySet().iterator();

        while(itr.hasNext()){

            Character c = itr.next();

            if(map.get(c) == 1){
                return s.indexOf(c);
            }
        }


        return ret;
    }

    public static void main(String[] args) {
        String s = "cc";

        System.out.println(firstUniqChar(s));

    }

}

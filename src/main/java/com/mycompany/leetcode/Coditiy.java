/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Meng
 */
public class Coditiy {

    public static void main(String[] args) {
        System.out.println("an " + solution("Sat", 23));
    }

    public static String solution(String S, int K) {
        String[] days = new String[]{"Mon", "Tues", "Wed", "Thu", "Fri", "Sat"};

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mon", 0);
        hashMap.put("Tues", 1);
        hashMap.put("Wed", 2);
        hashMap.put("Thu", 3);
        hashMap.put("Fri", 4);
        hashMap.put("Sat", 5);
        hashMap.put("Sun", 6);

        int dayofweek = hashMap.get(S);

        int nextDay = (dayofweek + K) % 7;

        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            if (hashMap.get(key) == nextDay) {
                return key;
            }
        }

        return null;
    }
}

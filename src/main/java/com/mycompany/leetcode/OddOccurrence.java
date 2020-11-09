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
public class OddOccurrence {

    public static void main(String[] args) {
        solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                int currentCnt = map.get(A[i]);
                currentCnt++;
                map.put(A[i], currentCnt);
            } else {
                map.put(A[i], 1);
            }
        }

        Set<Integer> keys = map.keySet();
        if (null != keys) {
            for (Integer key : keys) {
                if (map.get(key) == 1) {
                    return key;
                }
            }
        }

        return 0;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Meng
 */
public class Task2 {

    public static Map<Integer, Integer> mao = new HashMap<>();
    private static int glbcnt = 0;
    public static int max = 0;
    private static int cntGl = 0;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }

    public static int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        return loop(A, 0, 0);

    }

    public static int loop(int[] A, int index, int cnt) {
        int maxnow = max;
        if (glbcnt == A.length) {
            return maxnow;
        }

        try {
            if (A[index] == -1) {
                glbcnt++;
                // return 0;
                if (max < cntGl) {
                    max = cntGl;
                }
                cntGl = 0;
                return loop(A, glbcnt, cnt++);
            } else {
                int nextindex = A[index];
                A[index] = -1; // used
                cntGl++;
                return loop(A, nextindex, cnt++);
            }
        } catch (Exception e) {
            e.printStackTrace();
            loop(A, glbcnt, cnt);
        }
        return 0;
    }

}

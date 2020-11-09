/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Meng
 */
public class BinaryGap {

    // you can write to stdout for debugging purposes, e.g.
// System.out.print
    public static void main(String[] args) {
        // System.out.println(decToBinary(45666));
        traverse(decToBinary(15));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        return traverse(decToBinary(N));
    }

    public static int traverse(String binary) {
        String[] binaryAry = binary.split("");
        boolean isOpen = false;
        int max = 0;
        Map<Integer, String> myMap = new HashMap<>();
        for (int i = 0; i < binaryAry.length; i++) {
            if (binaryAry[i].equalsIgnoreCase("1") && (i < binaryAry.length - 1) && binaryAry[i + 1].equalsIgnoreCase("0")) {
                isOpen = true;
                int cnt = 0;
                for (int j = i + 1; j < binaryAry.length; j++) {
                    if (binaryAry[j].equalsIgnoreCase("0")) {
                        cnt++;
                        myMap.put(i, String.valueOf(cnt));
                    } else if (binaryAry[j].equalsIgnoreCase("1")) { // if equals 1
                        myMap.put(i, String.valueOf(cnt) + ":close@" + j);
                        if (max < cnt) {
                            max = cnt;
                        }
                        break;
                    } else {
                        myMap.remove(i);
                        break;
                    }
                }
            }
        }

        System.out.println(myMap + " and " + max);
        return max;
    }

    public static String decToBinary(int n) {
        int[] binaryNum = new int[1000];

        int i = 0;
        while (n > 0) {
            // storing remainder in binary array 
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("binaryNum " + binaryNum);
        String binarystr = "";

        for (int j = i - 1; j >= 0; j--) {
            // reverse order
            binarystr += String.valueOf(binaryNum[j]);
        }
        return binarystr;

    }
}

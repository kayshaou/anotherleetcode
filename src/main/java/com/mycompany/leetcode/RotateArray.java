/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

/**
 *
 * @author Meng
 */
public class RotateArray {

    public static void main(String[] args) {
        solution(new int[]{10, 20, 30, 40, 50}, 3); //expecting 40, 50, 10, 20, 30
    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] reverse = reverseArray(A);
        for (int i = 0; i < K - 1; i++) {
            int sqp = reverse[i + 1];
            int fqp = reverse[i];
            reverse[i] = sqp;
            reverse[i + 1] = fqp;
        }

        return reverse;
    }

    public static int[] reverseArray(int[] A) {
        int[] b = new int[A.length];
        int j = A.length;
        for (int i = 0; i < A.length; i++) {
            b[j - 1] = A[i];
            j = j - 1;
        }
        return b;
    }

}

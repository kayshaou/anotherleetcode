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
public class PlusOne {

    /**
     * Given a non-empty array of decimal digits representing a non-negative
     * integer, increment one to the integer.
     *
     * The digits are stored such that the most significant digit is at the head
     * of the list, and each element in the array contains a single digit.
     *
     * You may assume the integer does not contain any leading zero, except the
     * number 0 itself.
     *
     *
     */
    public static void main(String[] ars) {
        System.out.println(" --- gello" + plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));

    }

    public static int[] plusOne(int[] digits) {

        if (digits.length < 1 || digits.length > 100) {
            return null;
        }
        String ary = "";
        if (digits.length > 0) {
            for (int i = 0; i < digits.length; ++i) {
                if (digits[i] < 0 || digits[i] > 10) {
                    return null;
                }
                ary += String.valueOf(digits[i]) + ",";
            }

        }

        double parsedStr = 0;
        // increment
        if (ary != "") {
            ary = ary.replace(",", "");
            try {
                parsedStr = Integer.parseInt(ary) + 1;
            } catch (Exception e) {
                System.out.println("can't parse " + e.getLocalizedMessage());
                parsedStr = Double.parseDouble(ary) + 1;
                // return null;
            }

        }

        if (parsedStr == 0) {
            return null;
        }

        String parseBack = String.valueOf(parsedStr);
        String[] sParsdeBack = parseBack.split("");
        int[] in = new int[sParsdeBack.length];
        for (int j = 0; j < sParsdeBack.length; j++) {
            in[j] = Integer.parseInt(sParsdeBack[j]);
        }

        System.out.println("in " + in.toString());

        return in;
    }

}

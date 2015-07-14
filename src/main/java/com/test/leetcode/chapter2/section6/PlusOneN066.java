/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter2.section6;

import java.util.Arrays;

/**
 * Created by jiangnan04 on 15-7-14.
 */
public class PlusOneN066 {
    public int[] plusOne(int[] digits) {
        if (null == digits || digits.length == 0) {
            return null;
        }
        int isopsephy = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                digits[i] = digits[i] + 1;
            }
            digits[i] = digits[i] + isopsephy;
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 10;
                isopsephy = 1;
            } else {
                isopsephy = 0;
                break;
            }
        }
        if (isopsephy > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = isopsephy;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;
    }


    // copy from  http://www.jiuzhang.com/solutions/plus-one/
    // The complexity is O(1)
    // f(n) = 9/10 + 1/10 * O(n-1)
    //  ==>  O(n) =  10 / 9 = 1.1111 = O(1)

    public int[] plusOne2(int[] digits) {
        int carries = 1;
        for(int i = digits.length-1; i>=0 && carries > 0; i--){  // fast break when carries equals zero
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }
        if(carries == 0)
            return digits;

        int[] rst = new int[digits.length+1];
        rst[0] = 1;
        for(int i=1; i< rst.length; i++){
            rst[i] = digits[i-1];
        }
        return rst;
    }
    public static  void main(String[] args) {
        PlusOneN066 p = new PlusOneN066();
        System.out.println(Arrays.toString(p.plusOne(new int[]{2,1})));
        //System.out.println(Arrays.toString(p.plusOne(new int[]{0})));
    }

}

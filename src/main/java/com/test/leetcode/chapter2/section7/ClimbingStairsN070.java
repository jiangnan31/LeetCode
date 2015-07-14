/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter2.section7;

/**
 * Created by jiangnan04 on 15-7-14.
 */
public class ClimbingStairsN070 {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        if (n < 2) {
            return result[n];
        }
        for (int i =2; i < n + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}

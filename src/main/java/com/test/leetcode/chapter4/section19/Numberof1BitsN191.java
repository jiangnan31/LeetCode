/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter4.section19;

/**
 * Created by jiangnan04 on 15-7-27.
 */
public class Numberof1BitsN191 {

    // copy from http://www.jiuzhang.com/solutions/number-of-1-bits/
    public int hammingWeight2(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 1;
        while ((n & (n - 1)) != 0) {
            n &= n-1;
            count++;
        }
        return count;
    }

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        Numberof1BitsN191 n = new Numberof1BitsN191();
        System.out.println(n.hammingWeight2(3));
    }
}

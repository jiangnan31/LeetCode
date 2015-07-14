/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter1.section2;

/**
 * Created by jiangnan04 on 15-7-13.
 */
public class RemoveDuplicatesfromSortedArrayN026 {

    // ERROR   Time Limit Exceeded
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int duplicatesNum = 0;
        int allDuplicatesNum = 0;
        for (int i = nums.length -2; i >= 0; i--) {
            if (nums[i] == nums[i+1]) {
                duplicatesNum++;
                continue;
            }
            // 发现重复进行覆盖操作
            if (duplicatesNum > 0) {
                for (int j = i; j + duplicatesNum < nums.length - 1; j++) {
                    nums[j+1] = nums[j+1+duplicatesNum];
                }
                allDuplicatesNum += duplicatesNum;
                duplicatesNum = 0;
            }
        }
        return nums.length - allDuplicatesNum;
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[size]) {
                size++;
                nums[size] = nums[i];
            }
        }
        return size + 1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3,3,4};
        RemoveDuplicatesfromSortedArrayN026 t = new RemoveDuplicatesfromSortedArrayN026();
        System.out.println(t.removeDuplicates(a));
        int[] b = {1,1};
        System.out.println(t.removeDuplicates(b));

    }
}

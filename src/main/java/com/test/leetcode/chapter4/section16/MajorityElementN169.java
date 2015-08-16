/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter4.section16;

import java.util.HashMap;

/**
 * Created by jiangnan04 on 15-7-28.
 */
public class MajorityElementN169 {
    public int majorityElement(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(result.containsKey(nums[i])) {
                int temp = result.get(nums[i]);
                if (temp + 1 > nums.length/2) {
                    return nums[i];
                }
                result.put(nums[i], temp+1);
            } else {
                result.put(nums[i], 1);
            }
        }
        return 0;
    }

}

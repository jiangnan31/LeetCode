/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter5.section22;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangnan04 on 15-7-28.
 */
public class SummaryRangesN228 {

    public List<String> summaryRanges(int[] nums) {

        List<String> results = new ArrayList<String>();
        if (nums == null) {
            return null;
        }
        if (nums.length <= 0) {
            return results;
        }

        if (nums.length == 1) {
            results.add(nums[0] + "");
            return results;
        }
        int i = 1;
        int start = 0;
        StringBuffer sb = new StringBuffer();
        sb.append(nums[start]);
        while (i < nums.length) {
            if (nums[i] - nums[i - 1] != 1) {
                if (start == i - 1) {
                   results.add(nums[start] + "");
                   sb.delete(0, sb.length());
                } else {
                    sb.append("->");
                    sb.append(nums[i - 1]);
                    results.add(sb.toString());
                    sb.delete(0, sb.length());
                }
                start = i;
                sb.append(nums[start]);
            }
            i++;
        }
        if (start == nums.length - 1) {
            results.add(nums[start] + "");
        }else{
            sb.append("->");
            sb.append(nums[nums.length - 1]);
            results.add(sb.toString());
        }
        return results;

    }

    public static void main(String[] args) {
        SummaryRangesN228 s = new SummaryRangesN228();
        int[] a = {0,1,2,4,5,7};
        System.out.println(s.summaryRanges(a));
    }

}

/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter1.section2;

/**
 * Created by jiangnan04 on 15-7-13.
 */
public class RemoveElementN027 {
    public int removeElement(int[] nums, int val) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        int i = 0;
        int pointer = nums.length - 1;
        while(i <= pointer){
            if(nums[i] == val){
                nums[i] = nums[pointer];
                pointer--;
            } else {
                i++;
            }
        }
        return pointer + 1;
    }

    public static void main(String[] args) {
        RemoveElementN027 t = new RemoveElementN027();
        System.out.println(t.removeElement(new int[]{1,1,1}, 1));
        //System.out.println(t.removeElement(new int[]{1,2,3,3,1}, 1));
    }
}

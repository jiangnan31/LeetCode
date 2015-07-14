package com.test.leetcode.chapter1.section1;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumN015 {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num.length < 3) {
            return ret;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            if (i != 0 && num[i] == num[i - 1]) {
                continue; // to skip duplicate numbers; e.g [0,0,0,0]
            }
            int left = i + 1;
            int right = num.length - 1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if(sum == 0) {
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(num[i]);
                    tmp.add(num[left]);
                    tmp.add(num[right]);
                    ret.add(tmp);
                    left++;
                    right--;
                    //while (left < right && num[left] == num[left-1]) { //right
                    while (left < right && num[left] == num[left+1]) { //wrong
                        left++;
                    }
                    //while (left < right && num[right] == num[right+1]) { //right
                    while (left < right && num[right] == num[right-1]) { //wrong
                         right--;
                    }
                } else if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                }
            }
        }
        return ret;
    }

    public static void main (String[] args) {
        System.out.println(threeSum(new int[]{-2,0,1,1,2}));
        //Output: [[-2,0,2]]
        //Expected:   [[-2,0,2],[-2,1,1]]

    }
}

package com.test.leetcode.chapter1.section2;

import java.util.Arrays;

public class ThreeSumClosestN016 {

    public static int threeSumClosest(int[] num, int target) {
            if (null == num || num.length < 0) {
                return Integer.MAX_VALUE;
            }
            Arrays.sort(num);
            int closet = Integer.MAX_VALUE/2;
            for(int index=0; index < num.length -2; index++) {
                int left = index + 1;
                int right = num.length - 1;
                while(left < right){
                    int sum = num[index] + num[left] + num[right];
                    if (sum == target) {
                        return sum;
                    } else if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    }
                    closet = Math.abs(sum - target) < Math.abs(closet - target) ? sum : closet; 
                }
            }
            return closet;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }

}

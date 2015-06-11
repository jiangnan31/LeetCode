package com.test.leetcode.chapter3.section3;

import java.util.HashMap;
import java.util.Iterator;

public class SingleNumberN136 {

    public static int singleNumber(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }
    
    public static int singleNumber2(int[] A) {
        HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        if (A == null || A.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < A.length; i++) {
            if (tmp.containsKey(A[i])) {
                tmp.remove(A[i]);
            } else {
                tmp.put(A[i], 1);
            }
        }
        
        Iterator<Integer> interator = tmp.keySet().iterator();
        return (Integer) interator.next();
    }
    
    public static void main (String[] args){
        int[] A = {4,1,1,2,2,3,3};
        System.out.println(singleNumber(A));
        System.out.println(singleNumber2(A));
    }
}

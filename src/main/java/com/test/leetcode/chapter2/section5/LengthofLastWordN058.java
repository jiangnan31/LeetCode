/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter2.section5;

/**
 * Created by jiangnan04 on 15-7-14.
 */
public class LengthofLastWordN058 {
    public int lengthofLastWord(String ts) {
        String s =  ts.trim();
        if (null == s || 0 == s.length()) {
            return 0;
        }
        String[] tmp = s.split(" ");
        return tmp[tmp.length - 1].length();
    }


    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length == 0) {
                if (chars[i] == ' ') {
                    continue;
                } else {
                    length++;
                }
            } else {
                if (chars[i] == ' ') {
                    break;
                } else {
                    length++;
                }
            }
        }

        return length;
    }



    public static  void  main (String[] args) {
        LengthofLastWordN058 l = new LengthofLastWordN058();
        System.out.println(l.lengthofLastWord("World"));
    }
}

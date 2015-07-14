package com.test.leetcode.chapter1.section2;

public class ImplementStrStrN028 {

    public int strStr(String haystack, String needle) {
        if (null == haystack || null == needle) {
            return -1;
        }
        for (int i = 0; i <haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i+j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

}
